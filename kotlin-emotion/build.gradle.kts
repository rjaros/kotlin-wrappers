plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCsstype)
    commonMainApi(projects.kotlinBrowser)
    commonMainApi(projects.kotlinEmotionUtils)
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(libs.npm.emotion.cache))
    commonMainApi(npm(libs.npm.emotion.css))
    commonMainApi(npm(libs.npm.emotion.react))
    commonMainApi(npm(libs.npm.emotion.styled))
}
