object BuildPlugins {
    val androidGradlePlugin by lazy { "com.android.tools.build:gradle:${Versions.gradlePluginVersion}" }
    val kotlinPlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPluginVersion}" }
    val navigationPlugin by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.lifecycleVersion}" }
    val daggerHiltPlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHiltVersion}" }
    val realmPlugin by lazy { "io.realm:realm-gradle-plugin:${Versions.realmVersion}" }
//    val playServices by lazy { "com.google.gms:google-services:${Versions.googlePlayServicesVersion}" }
}
object TestLibs{
  val jUnitExt by lazy { "androidx.test.ext:junit:${Versions.jUnitExtVersion}" }
  val jUnit by lazy { "junit:junit:${Versions.jUnitVersion}" }
  val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}" }
  val testRunner by lazy { "androidx.test.runner.AndroidJUnitRunner" }
}

object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompatVersion}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timberVersion}" }
    val security by lazy { "androidx.security:security-crypto:${Versions.securityVersion}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.materialVersion}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}" }
    val androidCore by lazy { "androidx.core:core-ktx:${Versions.androidCoreVersion}" }
    val recyclerviewView by lazy { "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}" }
    val legacySupport by lazy { "androidx.legacy:legacy-support-v4:${Versions.supportv4Version}" }
    val coilVersion by lazy { "io.coil-kt:coil:${Versions.coilVersion}" }
    val playCore by lazy { "com.google.android.play:core:${Versions.playCoreVersion}" }
    val playCoreKtx by lazy { "com.google.android.play:core-ktx:${Versions.playCoreKtxVersion}" }
    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreenVersion}" }
    val daggerHilt by lazy { "com.google.dagger:hilt-android:${Versions.daggerHiltVersion}" }
    val daggerCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltVersion}" }
    val room by lazy { "androidx.room:room-runtime:${Versions.roomVersion}" }
    val roomRuntime by lazy { "androidx.room:room-ktx:${Versions.roomVersion}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.roomVersion}" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}" }
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}" }
    val lifecycleLiveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}" }
    val retrofitLoggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.retrofitLoggerVersion}" }
    val  okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.retrofitLoggerVersion}" }
    val kotlinxSeriliazationJson by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.seriliazationVersion}" }
    val kotlinxSeriliazationConverter by lazy { "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.seriliazationConverterVersion}" }
    val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.lifecycleVersion}" }
    val navigationUI by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.lifecycleVersion}" }
    val glide by lazy { "com.github.bumptech.glide:glide:${Versions.glideVersion}" }
    val glideKapt by lazy { "com.github.bumptech.glide:compiler:${Versions.glideVersion}" }
    val spinKit by lazy { "com.github.ybq:Android-SpinKit:${Versions.spinKitVersion}" }
    val multidex by lazy { "com.android.support:multidex:${Versions.multidexVersion}" }
    val databindingCompiler by lazy { "com.android.databinding:compiler:${Versions.databindingCompilerVersion}" }
    val timberLoggerStyler by lazy { "com.orhanobut:logger:${Versions.orhanobutVersion}" }
    val ably by lazy { "io.ably:ably-android:${Versions.ablyVersion}" }
    val flexBox by lazy { "com.google.android.flexbox:flexbox:${Versions.flexBoxVersion}" }
    val paging by lazy { "androidx.paging:paging-runtime-ktx:${Versions.pagingVersion}" }
    val lottie by lazy { "com.airbnb.android:lottie:${Versions.lottieVersion}" }
    val fragmentKtx by lazy { "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}" }
    val agora by lazy { "io.agora.rtc:full-sdk:${Versions.agoraVersion}" }
    val fireBaseBoom by lazy { "com.google.firebase:firebase-bom:${Versions.fireBaseBoomVersion}" }
    val firebaseAnalytics by lazy {"com.google.firebase:firebase-analytics-ktx"}
    val firebaseCommon by lazy {"com.google.firebase:firebase-config-ktx"}
//    val firebaseCore by lazy { "com.google.firebase:firebase-core:${Versions.fireBaseBoomVersion}"}
    val amplitudeAnalytics by lazy { "com.amplitude:android-sdk:${Versions.amplitudeAnalyticsVersion}"}
    val mikhaellopez by lazy { "com.mikhaellopez:circularimageview:${Versions.mikhaellopezVersion}"}
    val pullToRefresh by lazy { "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.pullToRefreshVersion}"}

}
