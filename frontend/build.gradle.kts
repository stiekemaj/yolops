plugins {
    id("com.github.node-gradle.node") version "3.5.1"
}

node {
    version.set("18.17.1")
    npmVersion.set("9.8.1")
    yarnVersion.set("1.22.19")
    download.set(true)
}

tasks.register<Exec>("buildFrontend") {
    workingDir = file(".")
    commandLine = listOf("yarn", "build") // Or "npm run build"
}

tasks.register<Exec>("startFrontend") {
    workingDir = file(".")
    commandLine = listOf("yarn", "dev") // Start Vite development server
}