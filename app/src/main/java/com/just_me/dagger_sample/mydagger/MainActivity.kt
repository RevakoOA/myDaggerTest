package com.just_me.dagger_sample.mydagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.just_me.dagger_sample.mydagger.utils.MyText
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mText: MyText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainComponent = DaggerMainComponent.create()
        mainComponent.injectMyStuff(this)
        setContentView(R.layout.activity_main)
        tvText.text = mText.content
    }
}
