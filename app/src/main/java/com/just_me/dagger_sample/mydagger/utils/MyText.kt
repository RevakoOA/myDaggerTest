package com.just_me.dagger_sample.mydagger.utils

import javax.inject.Inject

class MyText @Inject constructor(text: String) {
    val content = text
}