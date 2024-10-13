plugins {
    id("presentation-convention")
    alias(libs.plugins.kotlin.compose)
}

dependencies {
    implementation(projects.features.start.domain)
}