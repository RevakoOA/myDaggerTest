package com.just_me.dagger_sample.mydagger

import android.app.Application
import javax.inject.Inject

class MyApplication: Application() {

    @Inject lateinit var appComponent: MainComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerMainComponent.create()
    }
}