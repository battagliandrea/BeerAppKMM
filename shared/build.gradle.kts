import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.KOTLIN_MULTIPLATFORM)
    id(GradlePluginId.KOTLIN_SERIALIZATION)
    id(GradlePluginId.COCOAPODS)
    `maven-publish`
}

version = "1.0"

kotlin {
    android {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../iosApp/Podfile")
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(LibraryDependency.KOTLIN_SERIALIZATION)
                implementation(LibraryDependency.COROUTINES_NATIVE_CORE)
                implementation(LibraryDependency.KTOR)
                implementation(LibraryDependency.KTOR_SERIALIZATION)
                implementation(LibraryDependency.KOIN)
            }
        }
        val commonTest by getting
        val androidMain by getting {
            dependencies {
                implementation(LibraryDependency.KTOR_ANDROID)
            }
        }
        val androidTest by getting
        val iosMain by getting {
            dependencies {
                implementation(LibraryDependency.KTOR_IOS)
            }
        }
        val iosTest by getting
    }
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}