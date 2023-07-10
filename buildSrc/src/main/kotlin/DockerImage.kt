import org.gradle.api.Project

object DockerImage {
    const val BASE_IMAGE = "openjdk:17-oracle"

    const val CREATION_TIME = "USE_CURRENT_TIMESTAMP"

    val JVM_FLAGS = listOf(
            "-XX:+HeapDumpOnOutOfMemoryError",
            "-XX:HeapDumpPath=/dumps/",
            "-Djava.security.egd=file:/dev/./urandom",
            "-Duser.timezone=UTC",
            "-XX:MaxRAMPercentage=55.0",
            "-XX:+UseG1GC",
            "-XX:+UseStringDeduplication",
            "-Dspring.config.additional-location=optional:/etc/dozator/application.yml"
    )

    fun imagePath(project: Project): String =
            "registry.gitlab.com/dozator_lekarstv/dozator-be-mono_clone/" + project.property("name") + ":" + project.property("docker.tag")
}
