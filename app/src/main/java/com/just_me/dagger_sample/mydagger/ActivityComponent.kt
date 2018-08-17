package com.just_me.dagger_sample.mydagger

import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun pokeActivity(activity: MainActivity)
}