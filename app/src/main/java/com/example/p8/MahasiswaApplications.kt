package com.example.p8

import android.app.Application
import com.example.p8.repository.AppContainer
import com.example.p8.repository.MahasiswaContainer

class MahasiswaApplications:Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}