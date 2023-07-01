package com.ph03nixc0ders.njilaka.views

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import com.anupkumarpanwar.scratchview.ScratchView
import com.ph03nixc0ders.njilaka.R
import com.ph03nixc0ders.njilaka.databinding.ActivityHomeBinding
import com.ph03nixc0ders.njilaka.databinding.ActivitySplashScreenBinding

class Home : AppCompatActivity() {

    lateinit var _binding: ActivityHomeBinding
    private lateinit var bitmap: Bitmap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=ActivityHomeBinding.inflate(layoutInflater)
        val view=_binding.root
        setContentView(view)

        //INITVIEW
        initView()
    }

    fun initView(){
        //ACTION BAR
        this.supportActionBar?.hide()


        this._binding.scratchView.setRevealListener(object :ScratchView.IRevealListener{
            override fun onRevealed(scratchView: ScratchView?) {
                _binding.scratchView?.visibility=View.GONE
            }

            override fun onRevealPercentChangedListener(scratchView: ScratchView?, percent: Float) {
                Toast.makeText(this@Home,"Wow, mahay mikiky be ianao",Toast.LENGTH_SHORT).show()
            }
        })
    }


}