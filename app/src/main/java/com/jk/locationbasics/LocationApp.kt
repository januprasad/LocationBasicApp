package com.jk.locationbasics

import android.app.Application
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate

private const val App = "LocationApp"

class LocationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
    }

    companion object {
        fun log(tag: String, msg: String) {
            Log.w("$App $tag", msg)
        }
    }
}