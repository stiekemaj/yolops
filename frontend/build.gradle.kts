plugins {
    id("base")  // No Java plugin, since this is a frontend module
}

tasks.register<Exec>("buildFrontend") {
    workingDir = file(".")
    commandLine = listOf("yarn", "build") // Or "npm run build"
}

tasks.register<Exec>("startFrontend") {
    workingDir = file(".")
    commandLine = listOf("yarn", "dev") // Start Vite development server
}