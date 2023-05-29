plugins {
    kotlin("jvm")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("org.awaitility:awaitility-kotlin:_")
    implementation("org.apache.commons:commons-lang3:_")
    implementation("com.google.guava:guava:_")

    implementation("com.github.kenglxn.qrgen:javase:_")

    testImplementation(Testing.junit.api)
    testImplementation(Testing.junit.params)
    testRuntimeOnly(Testing.junit.engine)
    testImplementation("io.rest-assured:rest-assured:_")
    testImplementation("io.rest-assured:rest-assured-common:_")
    testImplementation("io.rest-assured:json-path:_")
    testImplementation("io.rest-assured:xml-path:_")
}
