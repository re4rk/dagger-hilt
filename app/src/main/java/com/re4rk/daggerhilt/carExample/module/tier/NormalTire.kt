package com.re4rk.daggerhilt.carExample.module.tier

import javax.inject.Inject

class NormalTire @Inject constructor() : Tire {
    override fun tire(): String = "승용차타이어"
}
