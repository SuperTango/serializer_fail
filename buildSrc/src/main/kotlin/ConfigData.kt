import org.gradle.api.JavaVersion

object ConfigData {
    const val compileSdkVersion = 32
    const val buildToolsVersion = "33.0.0 rc2"
    const val minSdkVersion = 23
    const val targetSdkVersion = 31
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val cmakeVersion = "3.18.1"
    const val cmakePath = "src/main/jni/CMakeLists.txt"
    const val cmakeSrcDir = "src/main/jni"
    const val cmakeArgs =  "-DANDROID_STL=c++_shared"
     val JAVA = JavaVersion.VERSION_1_8



}