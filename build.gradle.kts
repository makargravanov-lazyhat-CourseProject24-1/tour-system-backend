
plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

tasks.register<Exec>("update_submoules"){
    commandLine("git", "submodule", "update", "--init", "--recursive")
}