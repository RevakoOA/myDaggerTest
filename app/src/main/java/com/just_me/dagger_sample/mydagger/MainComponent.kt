package com.just_me.dagger_sample.mydagger

import dagger.Component
import dagger.Provides

@Component(modules = [MainModule::class])
interface MainComponent {
    fun injectMyStuff(activity: MainActivity)
}