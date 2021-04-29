object LibraryDependency {

    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${AppVersion.KOTLIN}"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${AppVersion.KOTLIN}"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlinx:kotlinx-serialization-core:${AppVersion.KOTLIN_SERIALIZATION}"

    const val COROUTINES_NATIVE_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${AppVersion.COROUTINES_NATIVE}"
    const val COROUTINES_ANDROID_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${AppVersion.COROUTINES_ANDROID}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${AppVersion.COROUTINES_ANDROID}"

    const val CORE_KTX = "androidx.core:core-ktx:${AppVersion.CORE_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${AppVersion.FRAGMENT_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${AppVersion.APP_COMPAT}"
    const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime:${AppVersion.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${AppVersion.LIFECYCLE}"
    const val LIFECYCLE_JAVA_8 =
        "androidx.lifecycle:lifecycle-common-java8:${AppVersion.LIFECYCLE}"
    const val LIFECYCLE_EXTENSION = "androidx.lifecycle:lifecycle-extensions:${AppVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${AppVersion.LIFECYCLE}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${AppVersion.CONSTRAINT_LAYOUT}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${AppVersion.RECYCLER_VIEW}"
    const val COORDINATOR_LAYOUT =
        "androidx.coordinatorlayout:coordinatorlayout:${AppVersion.COORDINATOR_LAYOUT}"
    const val MATERIAL = "com.google.android.material:material:${AppVersion.MATERIAL}"

    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${AppVersion.NAVIGATION}"
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${AppVersion.NAVIGATION}"
    const val NAVIGATION_FEATURES =
        "androidx.navigation:navigation-dynamic-features-fragment:${AppVersion.NAVIGATION}"

    const val DATA_STORE = "androidx.datastore:datastore-preferences:${AppVersion.DATA_STORE}"

    const val KTOR = "io.ktor:ktor-client-core:${AppVersion.KTOR}"
    const val KTOR_SERIALIZATION = "io.ktor:ktor-client-serialization:${AppVersion.KTOR}"
    const val KTOR_ANDROID = "io.ktor:ktor-client-android:${AppVersion.KTOR}"
    const val KTOR_IOS = "io.ktor:ktor-client-ios:${AppVersion.KTOR}"

    const val KOIN = "io.insert-koin:koin-core:${AppVersion.KOIN}"
    const val KOIN_KTOR = "io.insert-koin:koin-ktor:${AppVersion.KOIN}"
    const val KOIN_KTOR_LOGGER = "io.insert-koin:koin-logger-slf4j:${AppVersion.KOIN}"

    const val KOIN_ANDROID = "io.insert-koin:koin-android:${AppVersion.KOIN}"
    const val KOIN_ANDROID_EXT = "io.insert-koin:koin-android-ext:${AppVersion.KOIN}"

    const val GLIDE = "com.github.bumptech.glide:glide:${AppVersion.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${AppVersion.GLIDE}"

    const val TIMBER = "com.jakewharton.timber:timber:${AppVersion.TIMBER}"
}