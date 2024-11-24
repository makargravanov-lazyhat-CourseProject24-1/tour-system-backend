plugins {
    alias(libs.plugins.spring.kotlin)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependencyManagement)
}

subprojects {
    apply { plugin(rootProject.libs.plugins.spring.kotlin.get().pluginId) }
    apply { plugin(rootProject.libs.plugins.spring.boot.get().pluginId) }
    apply { plugin(rootProject.libs.plugins.spring.dependencyManagement.get().pluginId) }

    dependencies {
        implementation(rootProject.libs.spring.boot.starter)
        implementation(rootProject.libs.kotlin.reflect)
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }

    kotlin {
        compilerOptions {
            freeCompilerArgs.addAll("-Xjsr305=strict")
        }
    }
}