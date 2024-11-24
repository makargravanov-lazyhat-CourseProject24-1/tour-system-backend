enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "tour-system-backend"

val common = "ts-backend-common"
include(":$common")

val clientwebbff = "ts-client-web-bff"
include(":$clientwebbff")

val userservice = "ts-user-service"
include(":$userservice")

