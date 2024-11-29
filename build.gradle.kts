

tasks.register<Exec>("update_submoules"){
    group = "git"
    commandLine("git", "submodule", "update", "--init", "--recursive")
}