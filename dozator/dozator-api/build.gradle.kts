import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("org.springframework.boot")
    id("com.google.cloud.tools.jib")
    id("org.liquibase.gradle")
}

tasks.getByName<BootJar>("bootJar") {
    mainClass.set("io.dozator.DozatorAppKt")
    enabled = true
}

dependencies {
    implementation(project(":dozator:dto"))
    implementation(project(":dozator:domain"))
    implementation(project(":dozator:migration"))
    implementation(project(":dozator:migration-mongo"))

    implementation(project(":common"))
    implementation(project(":common:common-utils"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.15")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.4")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-api:2.0.4")
    implementation("org.springdoc:springdoc-openapi-starter-common:2.0.4")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.retry:spring-retry")

    implementation("org.springframework.boot:spring-boot-starter-security")

    // Redisson issue
    implementation(
        group = "io.netty",
        name = "netty-resolver-dns-native-macos",
        version = "_",
        classifier = "osx-aarch_64"
    )

    implementation("com.github.cloudyrock.mongock:mongock-spring-v5:_")
    implementation("com.github.cloudyrock.mongock:mongodb-springdata-v3-driver:_")
    implementation("com.google.guava:guava:_")
    implementation("org.postgresql:postgresql:42.5.4")
    implementation("org.liquibase:liquibase-core:4.20.0")
    implementation("ch.qos.logback:logback-classic:1.4.6")
    implementation("net.logstash.logback:logstash-logback-encoder:7.3")
    implementation("com.fasterxml.jackson.module:jackson-module-jaxb-annotations:2.14.2")
    implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.9.0")
    implementation("org.awaitility:awaitility-kotlin:4.2.0")

    // OkHttp + Retrofit
    api("com.squareup.okhttp3:okhttp:_")
    api("com.squareup.retrofit2:retrofit:2.7.2")
    implementation("com.squareup.retrofit2:converter-jackson:2.7.2")
    implementation("com.squareup.retrofit2:converter-moshi:2.7.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.squareup.okhttp3:logging-interceptor:_")
    implementation("com.squareup.retrofit2:converter-scalars:2.7.2")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
}

jib {
    from {
        image = DockerImage.BASE_IMAGE
    }
    to {
        image = "dozator:latest"
    }
    container {
        creationTime.set(DockerImage.CREATION_TIME)
        jvmFlags = DockerImage.JVM_FLAGS
        mainClass = "io.dozator.DozatorAppKt"
    }
}

tasks.register<com.google.cloud.tools.jib.gradle.BuildImageTask>("jibGitlab") {
    dependsOn("build")
    this.setJibExtension(project.extensions.getByName("jib") as com.google.cloud.tools.jib.gradle.JibExtension)

    doFirst {
        jib?.container {
            jvmFlags = DockerImage.JVM_FLAGS
        }
        jib?.from {
            image = DockerImage.BASE_IMAGE
        }
        jib?.to {
            image = DockerImage.imagePath(project)
            auth {
                username = project.property("registry.user").toString()
                password = project.property("registry.password").toString()
            }
            tags = setOf("$version")
        }
    }
    group = "jib"
}

