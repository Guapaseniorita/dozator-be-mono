plugins {
    kotlin("jvm")
    id("org.liquibase.gradle")
}

dependencies {
    implementation(project(":dozator:domain"))

    implementation("org.postgresql:postgresql:_")
    implementation("org.liquibase:liquibase-core:_")
    implementation("ch.qos.logback:logback-classic:_")

    liquibaseRuntime(project(":dozator:domain"))
    liquibaseRuntime("org.postgresql:postgresql:_")
    liquibaseRuntime("org.liquibase:liquibase-core:_")
    liquibaseRuntime("ch.qos.logback:logback-core:_")
    liquibaseRuntime("ch.qos.logback:logback-classic:_")
    liquibaseRuntime("org.liquibase.ext:liquibase-hibernate5:_")
}

liquibase {
    activities.create("main") {
        val db_dozator_url by project.extra.properties
        val db_dozator_username by project.extra.properties
        val db_dozator_password by project.extra.properties
        val packageName = "io.dozator.domain"
        val pathToChangeLog = "src/main/resources/liquibase/changelog"

        this.arguments = mapOf(
            "logLevel" to "info",
            "referenceUrl" to "hibernate:spring:${packageName}?dialect=org.hibernate.dialect.PostgreSQL10Dialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy",
            "changeLogFile" to "${pathToChangeLog}/changelog_${System.currentTimeMillis()}.xml",
            "driver" to "org.postgresql.Driver",
            "url" to db_dozator_url,
            "username" to db_dozator_username,
            "password" to db_dozator_password
        )
    }
    runList = "main"
}
