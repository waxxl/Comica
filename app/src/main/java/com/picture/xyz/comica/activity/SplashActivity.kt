package com.picture.xyz.comica.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.picture.xyz.comica.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.decorView.postDelayed(object : Runnable {
            override fun run() {
                startHome()
            }
        }, 500)
    }

    fun startHome() {
        var gotoHome = Intent()
        gotoHome.setClass(this, MainActivity::class.java)
        startActivity(gotoHome)
    }
}
