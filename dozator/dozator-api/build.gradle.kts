import com.google.cloud.tools.jib.gradle.JibExtension
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    id("com.google.cloud.tools.jib")
    id("org.liquibase.gradle")
//    kotlin("kapt")
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

    implementation("org.springdoc:springdoc-openapi-ui:_")
    implementation("org.springdoc:springdoc-openapi-kotlin:_")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.retry:spring-retry")

    implementation("org.springframework.boot:spring-boot-starter-security:_")

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
    implementation("org.postgresql:postgresql:_")
    implementation("org.liquibase:liquibase-core:_")
    implementation("ch.qos.logback:logback-classic:_")
    implementation("net.logstash.logback:logstash-logback-encoder:_")
    implementation("com.fasterxml.jackson.module:jackson-module-jaxb-annotations:_")

    implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:_")

//    implementation("org.mapstruct:mapstruct:_")
    implementation("org.awaitility:awaitility-kotlin:_")
//    kapt("org.mapstruct:mapstruct-processor:_")

    // OkHttp + Retrofit
    api("com.squareup.okhttp3:okhttp:_")
    api("com.squareup.retrofit2:retrofit:_")
    implementation("com.squareup.retrofit2:converter-jackson:_")
    implementation("com.squareup.retrofit2:converter-moshi:_")
    implementation("com.squareup.moshi:moshi-kotlin:_")
    implementation("com.squareup.okhttp3:logging-interceptor:_")
    implementation("com.squareup.retrofit2:converter-scalars:_")
    implementation("com.squareup.retrofit2:adapter-rxjava3:_")
    implementation("io.reactivex.rxjava3:rxkotlin:_")
}

configure<JibExtension> {
    from {
        image = DockerImage.BASE_IMAGE
    }
    to {
        image = DockerImage.imagePath(project)
    }
    container {
        creationTime = DockerImage.CREATION_TIME
        jvmFlags = DockerImage.JVM_FLAGS
    }
}
