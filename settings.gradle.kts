enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "tour-system-backend"

val common = "ts-backend-common"
include(":$common")

val client_web_bff = "ts-client-web-bff"
include(":$client_web_bff")

val user = "ts-user-service"
include(":$user")

val email = "ts-email-service"
include(":$email")

val tickets = "ts-tickets-service"
include(":$tickets")

val tour_processing = "ts-tour-processing-service"
include(":$tour_processing")

val payment = "ts-payment-service"
include(":$payment")

val agency = "ts-agency-service"
include(":$agency")

val auth_provider = "ts-auth-provider"
include(":$auth_provider")

