buildscript {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath(GradleClasspath.ANDROID_GRADLE)
        classpath(GradleClasspath.KOTLIN_GRADLE)
        classpath(GradleClasspath.KOTLIN_SERIALIZATION)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}