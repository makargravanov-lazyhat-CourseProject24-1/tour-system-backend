enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "tour-system-backend"

val common = "common"
include(":$common")

//SPRING
val spring = "spring"
include(":$spring")

val example = "example"
include(":$example")

//KTOR
val ktor = "ktor"
include(":$ktor")