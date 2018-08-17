package com.just_me.dagger_sample.mydagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.just_me.dagger_sample.mydagger.MainModule.Companion.HELLO
import com.just_me.dagger_sample.mydagger.MainModule.Companion.LOVE
import com.just_me.dagger_sample.mydagger.utils.MyText
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity(), Contract.View {

    lateinit var activityComponent: ActivityComponent

    @Inject @field:Named(HELLO)
    lateinit var mText: MyText
    @Inject @field:Named(LOVE)
    lateinit var mText1: MyText
    @Inject @field:PerActivity lateinit var presenter: Contract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate called")
        val appComponent = (application as MyApplication).appComponent
        activityComponent = appComponent.createActivityComponent(ActivityModule(this))
        activityComponent.pokeActivity(this)
        setContentView(R.layout.activity_main)
        tvText.text = mText.content + '\n' + mText1.content + '\n' + "presenter: $presenter" +
                '\n' + "this: $this" + " , equality: ${(presenter as PresenterImpl).view.equals(this)}" +
                '\n' + "appComponent: $appComponent" + '\n' + "activityComponent: $activityComponent"
    }
}
