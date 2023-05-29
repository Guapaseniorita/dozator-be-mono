import de.fayard.refreshVersions.bootstrapRefreshVersions

pluginManagement {
    repositories {
//        jcenter()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://plugins.gradle.org/m2")
    }
}

rootProject.name = "dozator-be-mono"

include(
    // Common
    ":common:common-utils",

    ":dozator:domain",
    ":dozator:dto",
    ":dozator:migration",
    ":dozator:migration-mongo",
    ":dozator:dozator-api",
)

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard.refreshVersions:refreshVersions:0.9.7")
}

bootstrapRefreshVersions()
