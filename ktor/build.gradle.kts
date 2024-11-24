plugins {
    alias(libs.plugins.ktor) apply false
}

subprojects {
    apply { plugin(rootProject.libs.plugins.ktor.get().pluginId) }

    dependencies {
        implementation(rootProject.projects.tsBackendCommon)
        implementation(rootProject.libs.ktor.core)
        implementation(rootProject.libs.ktor.netty)
    }
}