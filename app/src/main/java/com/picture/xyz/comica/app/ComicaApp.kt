package com.picture.xyz.comica.app

import android.app.Application
import android.content.Context

class ComicaApp :Application(){
    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}