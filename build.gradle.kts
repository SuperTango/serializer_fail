buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath (BuildPlugins.androidGradlePlugin)
        classpath (BuildPlugins.kotlinPlugin)
        classpath (BuildPlugins.navigationPlugin)
        classpath (BuildPlugins.daggerHiltPlugin)
        classpath (BuildPlugins.realmPlugin)
    }
}
tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}

//tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
////    kotlinOptions.useOldBackend = true
//    kotlinOptions {
//        useOldBackend = true
//    }
//
//}
