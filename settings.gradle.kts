enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ts"

val common = "common"
include(":$common")

//SPRING
val spring = "spring"
include(":$spring")

val clientwebbff = "clientwebbff"
include(":$spring:$clientwebbff")

//KTOR
val ktor = "ktor"
include(":$ktor")

val userservice = "userservice"
include(":$spring:$userservice")