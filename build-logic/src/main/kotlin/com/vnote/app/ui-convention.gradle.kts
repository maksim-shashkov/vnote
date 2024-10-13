import org.gradle.kotlin.dsl.dependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    //Unfortunately, we cannot add compose gradle plugin here, because it is restricted to specify plugin version here
}

android {
    baseAndroidConfig()
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.bundles.compose.libs)
}