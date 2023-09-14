package com.re4rk.daggerhilt.carExample.module

import com.re4rk.daggerhilt.carExample.module.engine.Engine
import com.re4rk.daggerhilt.carExample.module.tier.Tire
import javax.inject.Inject

class Bus @Inject constructor(val engine: Engine) : Car {
    lateinit var tire: Tire

    override fun engine(): String = engine.engine()

    override fun tire(): String = tire.tire()
}
