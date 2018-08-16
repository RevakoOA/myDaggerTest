package com.just_me.dagger_sample.mydagger

import dagger.Component

@Component
interface MainComponent {
    fun injectMyStuff(activity: MainActivity)
}