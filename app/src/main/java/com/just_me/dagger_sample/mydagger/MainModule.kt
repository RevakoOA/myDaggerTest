package com.just_me.dagger_sample.mydagger

import com.just_me.dagger_sample.mydagger.utils.MyText
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainModule {
    companion object {
        const val HELLO = "hello"
        const val LOVE = "love"
    }
    // first MyText is one way
    @Provides @Named(HELLO) fun myHello() = MyText("Hello from MainComponent")
    // second MyText is more advanced way to show that provides can find appropriate params as well
    @Provides @Named(LOVE) fun myLoveString() = "With love"
    @Provides @Named(LOVE) fun myLove(@Named(LOVE) string: String) = MyText(string)
}