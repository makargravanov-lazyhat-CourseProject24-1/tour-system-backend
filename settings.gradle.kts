enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ts"

val common = "common"
include(":$common")

//SPRING
val spring = "spring"
include(":$spring")

val example = "example"
include(":$spring:$example")

//KTOR
val ktor = "ktor"
include(":$ktor")