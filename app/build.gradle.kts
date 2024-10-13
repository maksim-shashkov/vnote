plugins {
    id("app-convention")
    alias(libs.plugins.kotlin.compose)
}

android {
    defaultConfig {
        applicationId = "com.vnote.app"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.features.start.presentation)
    implementation(projects.features.start.data)
    implementation(projects.features.start.domain)

    implementation(projects.ui.theme)
    implementation(projects.ui.components)

    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
    testImplementation(libs.junit)
}