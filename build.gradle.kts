plugins {
	alias(libs.plugins.kotlin.jvm) apply false
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
}