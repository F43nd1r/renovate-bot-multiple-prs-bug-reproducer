enableFeaturePreview("VERSION_CATALOGS")
rootProject.name = "renovate-bot-multiple-prs-bug-reproducer"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.nokee.dev/release") }
        maven { url = uri("https://repo.nokee.dev/snapshot") }
    }
}

