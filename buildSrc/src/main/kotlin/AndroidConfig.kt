object AndroidConfig {
    const val ID = "com.ab21.bricklist"

    const val COMPILE_SDK_VERSION = 30
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 30
    const val BUILD_TOOLS_VERSION = "30.0.2"

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

interface BuildType {

    companion object {
        const val RELEASE = "release"
        const val DEBUG = "debug"
    }

    val isMinifyEnabled: Boolean
}

object BuildTypeDebug : BuildType {
    override val isMinifyEnabled = false
}

object BuildTypeRelease : BuildType {
    override val isMinifyEnabled = false
}

interface Flavor {

    companion object {

        const val DIMENSION_ENV = "env"

        const val STAGE = "stage"
        const val PROD = "prod"
    }
}