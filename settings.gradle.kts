pluginManagement {
    repositories {
        google() // Ajout d'une syntaxe simplifiée pour Google
        mavenCentral()
        maven("https://jitpack.io")
        gradlePluginPortal()
    }
    // Vous pouvez ajouter ici d'autres configurations si nécessaire
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // Repositories nécessaires
        mavenCentral()
    }
}

rootProject.name = "apprendezvous"
include(":app")

 