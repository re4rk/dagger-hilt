package com.re4rk.daggerhilt.carExample.module.engine

import javax.inject.Inject

class LPG @Inject constructor() : Engine {
    override fun engine(): String = "LPG엔진"
}
