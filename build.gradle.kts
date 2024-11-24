plugins {
	alias(libs.plugins.kotlin.jvm)
}

repositories {
	mavenCentral()
}

allprojects {
	group = "ru.jetlabs"
	version = "0.0.1-SNAPSHOT"

	apply { plugin(rootProject.libs.plugins.kotlin.jvm.get().pluginId) }

	repositories {
		mavenCentral()
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