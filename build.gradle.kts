import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    `kotlin-dsl`
    kotlin("jvm") apply false
    kotlin("plugin.jpa") apply false
    kotlin("plugin.allopen") apply false
    kotlin("plugin.spring") apply false
    id("org.springframework.boot") apply false
    id("io.spring.dependency-management")
    id("com.google.cloud.tools.jib") apply false
    id("org.liquibase.gradle") apply false
//    id("org.jetbrains.kotlin.kapt") apply false
    jacoco
    java
}

allprojects {
    group = "io.dozator"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict", "-Xjvm-default=compatibility")
            jvmTarget = "1.8"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        maxHeapSize = "1G"
    }

    repositories {
//        jcenter()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://plugins.gradle.org/m2")
    }
}

subprojects {
    apply {
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("idea")
        plugin("jacoco")
    }

    dependencyManagement {
        imports {
//            mavenBom(Spring.boms.dependencies)
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
            mavenBom("com.github.cloudyrock.mongock:mongock-bom:4.3.8")
            mavenBom("com.squareup.okhttp3:okhttp-bom:4.9.0")
        }
    }

    dependencies {
        implementation("org.hibernate.validator:hibernate-validator:_")

        implementation("org.jetbrains.kotlin:kotlin-reflect:_")
        implementation(Kotlin.stdlib.jdk8)
        implementation(Kotlin.stdlib.jdk7)
        implementation(Kotlin.stdlib)
        implementation(Kotlin.stdlib.common)
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:_")
    }
}
