package com.just_me.dagger_sample.mydagger

import java.lang.annotation.Documented
import javax.inject.Scope

@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity