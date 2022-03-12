package com.jk.locationbasics

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class LocationApp : Application(){
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
    }
}