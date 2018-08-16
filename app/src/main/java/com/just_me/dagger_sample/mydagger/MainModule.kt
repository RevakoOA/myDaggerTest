package com.just_me.dagger_sample.mydagger

import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides fun myText() = "Hello from MainComponent"
}