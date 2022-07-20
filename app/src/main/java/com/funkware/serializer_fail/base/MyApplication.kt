package com.funkware.serializer_fail.base

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import io.realm.Realm
import io.realm.RealmConfiguration
import timber.log.Timber


class MyApplication : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: MyApplication? = null
        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(true)
            .methodCount(1)
            .methodOffset(5)
            .tag("")
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
//        TweakManager.initialize()

        Timber.plant(object : Timber.DebugTree() {
            override fun log(
                priority: Int, tag: String?, message: String, t: Throwable?
            ) {
                Logger.log(priority, "-$tag", message, t)
            }
        })

        Realm.init(this)
        val schemaVersion: Long = 1
        val realmConfig = RealmConfiguration.Builder()
            .name("ExampleAndroid2")
            .schemaVersion(schemaVersion)
            .build()
        Realm.deleteRealm(realmConfig)
        Realm.setDefaultConfiguration(realmConfig)
//        SharedPreference(applicationContext)

    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}