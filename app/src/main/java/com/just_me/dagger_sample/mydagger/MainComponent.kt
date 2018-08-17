package com.just_me.dagger_sample.mydagger

import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface MainComponent {
//    fun injectMyStuff(activity: MainActivity)
    fun createActivityComponent(module: ActivityModule): ActivityComponent
}