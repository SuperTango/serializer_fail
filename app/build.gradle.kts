import Deps.multidex

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id ("realm-android")
    id("dagger.hilt.android.plugin")
    id ("org.jetbrains.kotlin.plugin.serialization") version "1.6.20"
    id ("androidx.navigation.safeargs")
//    id ("com.google.gms.google-services")
}

android {
    defaultConfig {
        applicationId = "com.funkware.serializer_fail"
        minSdk = (ConfigData.minSdkVersion)
        targetSdk = (ConfigData.targetSdkVersion)
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
        buildToolsVersion = (ConfigData.buildToolsVersion)
        compileSdk = ConfigData.compileSdkVersion
        multiDexEnabled = true
        testInstrumentationRunner = TestLibs.testRunner
        ndkVersion = ("23.1.7779620")
        ndk {
            abiFilters.add("armeabi-v7a")
            abiFilters.add( "arm64-v8a")
            abiFilters.add( "x86")
            abiFilters.add( "x86_64")
        }

        compileOptions.incremental = false
    }

    buildFeatures{
        prefab = true
        dataBinding = true
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    signingConfigs {
        create ( "release" ){
            storeFile = file( project.properties["storeFile"].toString())
            storePassword =  project.properties["storePassword"].toString()
            keyAlias =  project.properties["keyAlias"].toString()
            keyPassword =  project.properties["keyPassword"].toString()
        }
    }

    buildTypes {
        getByName("release") {
            buildConfigField ("String", "base_url", project.properties["productionBaseURL"].toString())
            buildConfigField ("String", "amplitude_api_key", project.properties["amplitudeProductionKey"].toString())
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
        getByName("debug") {
            buildConfigField ("String", "base_url", project.properties["stagingBaseURL"].toString())
            buildConfigField ("String", "amplitude_api_key", project.properties["amplitudeStagingKey"].toString())
            applicationIdSuffix = ".preview"
            versionNameSuffix =  "-debug"
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = ConfigData.JAVA
        targetCompatibility = ConfigData.JAVA
    }
}
dependencies {
    implementation (Deps.androidCore)
    implementation (Deps.appCompat)
    implementation (Deps.materialDesign)
    implementation (Deps.legacySupport)
    implementation (Deps.recyclerviewView)
    implementation (Deps.multidex)

    kapt (Deps.databindingCompiler)
    testImplementation (TestLibs.jUnit)
    androidTestImplementation (TestLibs.jUnitExt)
    androidTestImplementation (TestLibs.espresso)
    implementation (Deps.coilVersion)
    implementation (Deps.constraintLayout)
    implementation (Deps.playCore)
    implementation (Deps.playCoreKtx)
    implementation (Deps.splashScreen)
    implementation (Deps.daggerHilt)
    kapt (Deps.daggerCompiler)
    implementation (Deps.coroutinesCore)
    implementation (Deps.coroutinesAndroid)
    implementation (Deps.lifecycleViewModel)
    implementation (Deps.lifecycleRuntime)
    implementation (Deps.lifecycleLiveData)
    implementation (Deps.retrofit)
    implementation (Deps.okHttp)
    implementation (Deps.retrofitLoggingInterceptor)
    implementation (Deps.kotlinxSeriliazationJson)
    implementation (Deps.kotlinxSeriliazationConverter)
    implementation (Deps.navigationFragment)
    implementation (Deps.navigationUI)
    implementation (Deps.glide)
    kapt (Deps.glideKapt)
    implementation (Deps.timberLoggerStyler)
    implementation (Deps.timber)
    implementation (Deps.ably)
    implementation (Deps.flexBox)
    implementation (Deps.paging)
    implementation (Deps.lottie)
    implementation (Deps.security)
    implementation (Deps.amplitudeAnalytics)
    implementation (Deps.pullToRefresh)
    implementation(platform(Deps.fireBaseBoom))
    implementation (Deps.firebaseCommon)
    implementation (Deps.firebaseAnalytics)
    implementation (Deps.mikhaellopez)


    implementation (Deps.fragmentKtx)
//    implementation (Deps.agora)
}
kapt { correctErrorTypes = true
}