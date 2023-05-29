package io.dozator.domain.repository.config

import org.springframework.data.mapping.context.MappingContext
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.mapping.MongoPersistentEntity
import org.springframework.data.mongodb.core.mapping.MongoPersistentProperty
import org.springframework.data.mongodb.repository.query.MongoQueryMethod
import org.springframework.data.mongodb.repository.query.StringBasedMongoQuery
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory
import org.springframework.data.projection.ProjectionFactory
import org.springframework.data.repository.core.NamedQueries
import org.springframework.data.repository.core.RepositoryMetadata
import org.springframework.data.repository.query.QueryLookupStrategy
import org.springframework.data.repository.query.QueryLookupStrategy.Key
import org.springframework.data.repository.query.QueryMethodEvaluationContextProvider
import org.springframework.data.repository.query.RepositoryQuery
import org.springframework.expression.spel.standard.SpelExpressionParser
import java.lang.reflect.Method
import java.util.*


class InheritanceAwareMongoRepositoryFactory(
    private val operations: MongoOperations
) : MongoRepositoryFactory(operations) {

    override fun getQueryLookupStrategy(key: Key?, contextProvider: QueryMethodEvaluationContextProvider) = Optional.of(
        MongoQueryLookupStrategy(
            operations, contextProvider,
            operations.converter.mappingContext
        ) as QueryLookupStrategy
    )

    private class MongoQueryLookupStrategy(
        private val operations: MongoOperations,
        private val contextProvider: QueryMethodEvaluationContextProvider,
        var mappingContext: MappingContext<out MongoPersistentEntity<*>?, MongoPersistentProperty>
    ) : QueryLookupStrategy {

        override fun resolveQuery(
            method: Method,
            metadata: RepositoryMetadata,
            factory: ProjectionFactory,
            namedQueries: NamedQueries
        ): RepositoryQuery {
            val queryMethod = MongoQueryMethod(method, metadata, factory, mappingContext)
            val namedQueryName = queryMethod.namedQueryName
            return if (namedQueries.hasQuery(namedQueryName)) {
                val namedQuery: String = namedQueries.getQuery(namedQueryName)
                StringBasedMongoQuery(
                    namedQuery, queryMethod, operations, EXPRESSION_PARSER,
                    contextProvider
                )
            } else if (queryMethod.hasAnnotatedQuery()) {
                StringBasedMongoQuery(
                    queryMethod,
                    operations, EXPRESSION_PARSER,
                    contextProvider
                )
            } else {
                InheritanceAwarePartTreeMongoQuery(queryMethod, operations, EXPRESSION_PARSER, contextProvider)
            }
        }
    }

    companion object {
        private val EXPRESSION_PARSER = SpelExpressionParser()
    }
}