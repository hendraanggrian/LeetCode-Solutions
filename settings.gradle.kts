pluginManagement.repositories {
    mavenCentral()
    gradlePluginPortal()
}
dependencyResolutionManagement.repositories {
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

rootProject.name = "LeetCode-Solutions"

include("app")
include("website")
