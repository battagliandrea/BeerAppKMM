import org.gradle.api.artifacts.dsl.DependencyHandler


object AppDependencies {
    val kotlin = arrayListOf<String>().apply {
        add(LibraryDependency.KOTLIN)
        add(LibraryDependency.KOTLIN_REFLECT)
        add(LibraryDependency.COROUTINES_ANDROID_CORE)
        add(LibraryDependency.COROUTINES_ANDROID)
        add(LibraryDependency.CORE_KTX)
        add(LibraryDependency.FRAGMENT_KTX)
    }

    val appLibraries = arrayListOf<String>().apply {
        add(LibraryDependency.APP_COMPAT)
        add(LibraryDependency.LIFECYCLE_RUNTIME)
        add(LibraryDependency.LIFECYCLE_RUNTIME_KTX)
        add(LibraryDependency.LIFECYCLE_JAVA_8)
        add(LibraryDependency.LIFECYCLE_EXTENSION)
    }

    val viewModel = arrayListOf<String>().apply {
        add(LibraryDependency.LIFECYCLE_VIEW_MODEL_KTX)
    }

    val ui = arrayListOf<String>().apply {
        add(LibraryDependency.CONSTRAINT_LAYOUT)
        add(LibraryDependency.COORDINATOR_LAYOUT)
        add(LibraryDependency.RECYCLER_VIEW)
        add(LibraryDependency.MATERIAL)
    }

    val navigation = arrayListOf<String>().apply {
        add(LibraryDependency.NAVIGATION_FRAGMENT_KTX)
        add(LibraryDependency.NAVIGATION_UI_KTX)
        add(LibraryDependency.NAVIGATION_FEATURES)
    }

    val glide = arrayListOf<String>().apply {
        add(LibraryDependency.GLIDE)
    }

    val glideCodegen = arrayListOf<String>().apply {
        add(LibraryDependency.GLIDE_COMPILER)
    }

    val datastore = arrayListOf<String>().apply {
        add(LibraryDependency.DATA_STORE)
    }

    val timber = arrayListOf<String>().apply {
        add(LibraryDependency.TIMBER)
    }

    val koin = arrayListOf<String>().apply {
        add(LibraryDependency.KOIN)
    }

    val koinAndroid = arrayListOf<String>().apply {
        add(LibraryDependency.KOIN_ANDROID)
        add(LibraryDependency.KOIN_ANDROID_EXT)
    }
}

fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.api(list: List<String>) {
    list.forEach { dependency ->
        add("api", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}

fun DependencyHandler.debugImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("debugImplementation", dependency)
    }
}

fun DependencyHandler.releaseImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("releaseImplementation", dependency)
    }
}