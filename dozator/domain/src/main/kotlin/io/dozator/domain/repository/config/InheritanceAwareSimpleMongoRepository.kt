package io.dozator.domain.repository.config

import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.repository.query.MongoEntityInformation
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository
import java.io.Serializable


class InheritanceAwareSimpleMongoRepository<T, ID : Serializable?>(
    private val entityInformation: MongoEntityInformation<T, ID>,
    private val mongoOperations: MongoOperations
) : SimpleMongoRepository<T, ID>(entityInformation, mongoOperations) {

    override fun count(): Long {
        return getCriteria()?.let {
            mongoOperations.count(
                Query().addCriteria(it),
                entityInformation.javaType,
                entityInformation.collectionName
            )
        } ?: super.count()
    }

    override fun findAll(): List<T> {
        return getCriteria()?.let {
            mongoOperations.find(
                Query().addCriteria(it),
                entityInformation.javaType,
                entityInformation.collectionName
            )
        } ?: super.findAll()
    }

    private fun getCriteria() = if (entityInformation.javaType.isAnnotationPresent(TypeAlias::class.java)) {
        where("_class").`is`(entityInformation.javaType.getAnnotation(TypeAlias::class.java).value)
    } else null

}