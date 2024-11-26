plugins {
    alias(libs.plugins.spring.kotlin)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependencyManagement)
}

dependencies {
    implementation(libs.spring.boot.starter)
    implementation(libs.spring.boot.webMVC)
    implementation(libs.kotlin.reflect)
    implementation(projects.tsBackendCommon)
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.projectlombok:lombok")
    implementation("io.jsonwebtoken:jjwt:0.11.5")
    testImplementation("org.springframework.security:spring-security-test")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}