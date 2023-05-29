plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":dozator:domain"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")

    implementation("com.github.cloudyrock.mongock:mongock-spring-v5:_")
    implementation("com.github.cloudyrock.mongock:mongodb-springdata-v3-driver:_")
}