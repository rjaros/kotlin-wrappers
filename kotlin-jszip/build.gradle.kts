plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinWeb)
    commonMainApi(npm(libs.npm.jszip))
}
