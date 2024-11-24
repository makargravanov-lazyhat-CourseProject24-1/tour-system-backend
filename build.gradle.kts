plugins {
	alias(libs.plugins.kotlin.jvm)
}

repositories {
	mavenCentral()
}

group = "ru.jetlabs"
version = "0.0.1-SNAPSHOT"

subprojects {
	apply { plugin(rootProject.libs.plugins.kotlin.jvm.get().pluginId) }

	java {
		toolchain {
			languageVersion = JavaLanguageVersion.of(21)
		}
	}

	repositories {
		mavenCentral()
	}

	kotlin {
		compilerOptions {
			freeCompilerArgs.addAll("-Xjsr305=strict")
		}
	}
}