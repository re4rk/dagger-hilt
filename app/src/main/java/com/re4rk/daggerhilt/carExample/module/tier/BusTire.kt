package com.re4rk.daggerhilt.carExample.module.tier

import javax.inject.Inject

class BusTire @Inject constructor() : Tire {
    override fun tire(): String = "버스타이어"
}
