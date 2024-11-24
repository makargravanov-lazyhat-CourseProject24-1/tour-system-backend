enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "tour-system-backend"

val common = "common"
include(":$common")

//SPRING
val spring = "spring"
include(":$spring")

val clientwebbff = "ts-client-web-bff"
include(":$spring:$clientwebbff")

//KTOR
val ktor = "ktor"
include(":$ktor")

val userservice = "userservice"
include(":$ktor:$userservice")