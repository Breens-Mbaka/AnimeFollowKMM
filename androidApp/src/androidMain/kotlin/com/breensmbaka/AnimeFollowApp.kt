package com.breensmbaka

import android.app.Application
import di.initKoin
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level
class AnimeFollowApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger(level = if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(androidContext = this@AnimeFollowApp)
        }
    }
}
