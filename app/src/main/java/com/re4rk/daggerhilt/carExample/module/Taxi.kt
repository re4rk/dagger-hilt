package com.re4rk.daggerhilt.carExample.module

import com.re4rk.daggerhilt.carExample.di.module.LPGQualifier
import com.re4rk.daggerhilt.carExample.module.engine.Engine
import com.re4rk.daggerhilt.carExample.module.tier.Tire
import javax.inject.Inject

class Taxi @Inject constructor(val tire: Tire) : Car {
    @Inject
    @LPGQualifier
    lateinit var engine: Engine

    override fun engine(): String = engine.engine()

    override fun tire(): String = tire.tire()
}
