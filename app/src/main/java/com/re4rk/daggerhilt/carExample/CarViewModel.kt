package com.re4rk.daggerhilt.carExample

import androidx.lifecycle.ViewModel
import com.re4rk.daggerhilt.carExample.module.Car
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class CarViewModel @Inject constructor(
    @Named("버스") val bus: Car,
) : ViewModel()
