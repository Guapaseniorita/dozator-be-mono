package io.dozator

import com.github.cloudyrock.spring.v5.EnableMongock
import io.dozator.domain.repository.config.InheritanceAwareMongoRepositoryFactoryBean
import io.dozator.domain.repository.config.InheritanceAwareSimpleMongoRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.retry.annotation.EnableRetry
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableScheduling
@EnableAsync
@ConfigurationPropertiesScan
@EnableConfigurationProperties
@EnableTransactionManagement
@SpringBootApplication(
    scanBasePackages = ["io.dozator.*"],
)
@EntityScan(
    basePackages = ["io.dozator.domain"],
    basePackageClasses = [Jsr310JpaConverters::class]
)
@EnableJpaRepositories(basePackages = ["io.dozator.domain"])
@EnableMongoRepositories(
    basePackages = ["io.dozator.domain"],
    repositoryBaseClass = InheritanceAwareSimpleMongoRepository::class,
    repositoryFactoryBeanClass = InheritanceAwareMongoRepositoryFactoryBean::class
)
@EnableRetry
@EnableMongock
class DozatorApp

fun main(args: Array<String>) {
    runApplication<DozatorApp>(*args)
}
