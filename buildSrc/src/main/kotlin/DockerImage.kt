import org.gradle.api.Project

object DockerImage {
    const val BASE_IMAGE = "docker.io/adoptopenjdk/openjdk11:x86_64-ubuntu-jre-11.0.11_9"

    const val CREATION_TIME = "USE_CURRENT_TIMESTAMP"

    val JVM_FLAGS = listOf(
            "-XX:+HeapDumpOnOutOfMemoryError",
            "-XX:HeapDumpPath=/dumps/",
            "-Djava.security.egd=file:/dev/./urandom",
            "-Duser.timezone=UTC",
            "-XX:MaxRAMPercentage=55.0",
            "-XX:+UseG1GC",
            "-XX:+UseStringDeduplication"
    )

    fun imagePath(project: Project): String =
            "registry.gitlab.com/dozator_lekarstv/dozator-be-mono/" + project.property("name") + ":" + project.property("docker.tag")
}
