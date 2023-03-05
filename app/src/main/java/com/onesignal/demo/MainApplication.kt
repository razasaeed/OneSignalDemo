package com.onesignal.demo

import android.app.Application
import com.onesignal.OneSignal

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId("b8b2b6e4-c2ad-4156-8008-9a8525c70026")

    }
}