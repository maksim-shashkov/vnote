pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Recursively include all subdirectories as modules
private fun includeModules(dir: File) {
    dir.listFiles()?.forEach { file ->
        if (file.isDirectory && file.listFiles()?.any { it.name == "build.gradle.kts" || it.name == "build.gradle" } == true) {
            val moduleName = file.relativeTo(rootDir).path.replace(File.separator, ":")
            include(":$moduleName")
            project(":$moduleName").projectDir = file
        }
        // Recursive call to include nested subdirectories
        includeModules(file)
    }
}

rootProject.name = "vnote"
include(":app")
includeModules(file("features"))