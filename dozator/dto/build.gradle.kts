plugins {
    kotlin("jvm")
//    kotlin("kapt")
}

dependencies {
    implementation(project(":common"))
    implementation(project(":common:common-utils"))

    implementation(project(":dozator:domain"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    implementation("org.springdoc:springdoc-openapi-ui:_")
    implementation("org.springdoc:springdoc-openapi-kotlin:_")

    implementation("javax.validation:validation-api:_")

//    implementation("org.mapstruct:mapstruct:_")
//    kapt("org.mapstruct:mapstruct-processor:_")
}
