package com.ph03nixc0ders.njilaka.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import com.ph03nixc0ders.njilaka.R
import com.ph03nixc0ders.njilaka.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    lateinit var _binding:ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        val view=_binding.root
        setContentView(view)

        //INITVIEW
        initView()
    }


    override fun onStart() {
        super.onStart()
    }

    fun initView(){
        //Hide action bar
        this.supportActionBar?.hide()

        //Animation
        val animation_image=AnimationUtils.loadAnimation(this,R.anim.slide_in_top)
        val animation_slogan=AnimationUtils.loadAnimation(this,R.anim.fade_in)

        this._binding.logo.startAnimation(animation_image)
        this._binding.slogan.startAnimation(animation_slogan)

        //REDIRECT TO HOME ACTIVITY AFTER 5s
        val delayMillis=5000L
        Handler().postDelayed({
            val intent= Intent(this@SplashScreen,Home::class.java)
            startActivity(intent)
            finish()
        },delayMillis)

    }
}