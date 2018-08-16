package com.just_me.dagger_sample.mydagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.just_me.dagger_sample.mydagger.MainModule.Companion.HELLO
import com.just_me.dagger_sample.mydagger.MainModule.Companion.LOVE
import com.just_me.dagger_sample.mydagger.utils.MyText
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject @field:Named(HELLO)
    lateinit var mText: MyText
    @Inject @field:Named(LOVE)
    lateinit var mText1: MyText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainComponent = DaggerMainComponent.create()
        mainComponent.injectMyStuff(this)
        setContentView(R.layout.activity_main)
        tvText.text = mText.content + '\n' + mText1.content
    }
}
