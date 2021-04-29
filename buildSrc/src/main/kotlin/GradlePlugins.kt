object GradlePluginId {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val JAVA_LIBRARY = "java-library"
    const val KOTLIN = "kotlin"
    const val KOTLIN_MULTIPLATFORM = "org.jetbrains.kotlin.multiplatform"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlin.plugin.serialization"
    const val KOTLIN_KAPT = "org.jetbrains.kotlin.kapt"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val KTLINT_GRADLE = "org.jlleitschuh.gradle.ktlint"
    const val SAFE_ARGS = "androidx.navigation.safeargs.kotlin"
    const val COCOAPODS = "org.jetbrains.kotlin.native.cocoapods"
}

object GradleClasspath {
    const val ANDROID_GRADLE =
        "com.android.tools.build:gradle:${AppVersion.ANDROID_GRADLE}"
    const val KOTLIN_GRADLE =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${AppVersion.KOTLIN}"
    const val KOTLIN_SERIALIZATION =
        "org.jetbrains.kotlin:kotlin-serialization:${AppVersion.KOTLIN}"
    const val KTLINT_GRADLE =
        "org.jlleitschuh.gradle:ktlint-gradle:${AppVersion.KTLINT_GRADLE}"
    const val SAFE_ARGS =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${AppVersion.SAFE_ARGS}"
}