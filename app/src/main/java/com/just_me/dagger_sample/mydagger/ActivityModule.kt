package com.just_me.dagger_sample.mydagger

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val view: Contract.View) {
    @Provides @PerActivity fun providePresenter():Contract.Presenter = PresenterImpl(view)
}