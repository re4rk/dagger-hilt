package com.re4rk.daggerhilt.carExample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.re4rk.daggerhilt.R
import com.re4rk.daggerhilt.carExample.module.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class CarActivity : AppCompatActivity() {

    val vm: CarViewModel by viewModels()

    @Inject
    @Named("택시")
    lateinit var taxi: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.taxi_engine).text = taxi.engine()
        findViewById<TextView>(R.id.taxi_tier).text = taxi.tire()

        findViewById<TextView>(R.id.bus_engine).text = vm.bus.engine()
        findViewById<TextView>(R.id.bus_tire).text = vm.bus.tire()
    }
}
