import org.gradle.api.JavaVersion


object AndroidConst {
    const val NAMESPACE = "com.vnote.app"
    const val COMPILE_SDK = 34
    const val MIN_SDK = 24
    const val KOTLIN_JVM_TARGET = "1.8"

    val COMPILE_JDK_VERSION = JavaVersion.VERSION_1_8
}