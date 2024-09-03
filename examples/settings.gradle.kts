rootProject.name = "examples"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    versionCatalogs {
        create("libs") {
            val wrappersVersion = extra["kotlin-wrappers.version"] as String
            from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
        }
    }
}

include("react-lazy-modules-webpack")

// Old examples
include("please-split-me")

// Kotlin Wrappers
includeBuild("../")
