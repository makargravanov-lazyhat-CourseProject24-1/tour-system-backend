enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "tour-system-backend"

val common = "ts-backend-common"
includeBuild(common)

val client_web_bff = "ts-client-web-bff"
includeBuild(client_web_bff)

val user = "ts-user-service"
includeBuild(user)

val email = "ts-email-service"
includeBuild(email)

val tickets = "ts-tickets-service"
includeBuild(tickets)

val tour_processing = "ts-tour-processing-service"
includeBuild(tour_processing)

val payment = "ts-payment-service"
includeBuild(payment)

val agency = "ts-agency-service"
includeBuild(agency)

val auth_provider = "ts-auth-provider"
includeBuild(auth_provider)

val tour_data = "ts-tour-data-service"
includeBuild(tour_data)

