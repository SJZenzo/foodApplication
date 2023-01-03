package com.enzo.foodaplication.ui

import android.net.wifi.aware.DiscoverySession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enzo.foodaplication.R
import com.enzo.foodaplication.manager.DishesManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}