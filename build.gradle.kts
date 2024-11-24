plugins {
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.spring.kotlin) apply false
	alias(libs.plugins.spring.boot) apply false
	alias(libs.plugins.spring.dependencyManagement) apply false
}

repositories {
	mavenCentral()
}

subprojects {
	group = "ru.jetlabs"
	version = "0.0.1-SNAPSHOT"

	apply { plugin(rootProject.libs.plugins.kotlin.jvm.get().pluginId) }
	apply { plugin(rootProject.libs.plugins.spring.kotlin.get().pluginId) }
	apply { plugin(rootProject.libs.plugins.spring.boot.get().pluginId) }
	apply { plugin(rootProject.libs.plugins.spring.dependencyManagement.get().pluginId) }

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation(rootProject.libs.spring.boot.starter)
		implementation(rootProject.libs.spring.webMVC)
		implementation(rootProject.libs.kotlin.reflect)
		implementation(rootProject.projects.tsBackendCommon)
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