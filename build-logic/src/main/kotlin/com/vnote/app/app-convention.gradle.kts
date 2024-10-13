import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //Unfortunately, we cannot add compose gradle plugin here, because it is restricted to specify plugin version here
}

configure<BaseAppModuleExtension> {
    baseAndroidConfig()
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.bundles.android)
    implementation(libs.bundles.compose.libs)
    implementation(platform(libs.compose.bom))

    testImplementation(libs.junit)
    testImplementation(libs.mockk)
}