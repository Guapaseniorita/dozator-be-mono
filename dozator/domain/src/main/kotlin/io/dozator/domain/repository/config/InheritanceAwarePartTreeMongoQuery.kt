package io.dozator.domain.repository.config

import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor
import org.springframework.data.mongodb.repository.query.MongoQueryMethod
import org.springframework.data.mongodb.repository.query.PartTreeMongoQuery
import org.springframework.data.repository.query.QueryMethodEvaluationContextProvider
import org.springframework.expression.ExpressionParser


class InheritanceAwarePartTreeMongoQuery(
    private val method: MongoQueryMethod,
    mongoOperations: MongoOperations,
    expressionParser: ExpressionParser,
    contextProvider: QueryMethodEvaluationContextProvider
) : PartTreeMongoQuery(method, mongoOperations, expressionParser, contextProvider) {

    override fun createQuery(accessor: ConvertingParameterAccessor): Query {
        return super.createQuery(accessor).apply {
            getCriteria()?.let { criteria -> this.addCriteria(criteria) }
        }
    }

    override fun createCountQuery(accessor: ConvertingParameterAccessor): Query {
        return super.createCountQuery(accessor).apply {
            getCriteria()?.let { criteria -> this.addCriteria(criteria) }
        }
    }


    private fun getCriteria() = if (method.entityInformation.javaType.isAnnotationPresent(TypeAlias::class.java)) {
        Criteria.where("_class").`is`(method.entityInformation.javaType.getAnnotation(TypeAlias::class.java).value)
    } else null
}