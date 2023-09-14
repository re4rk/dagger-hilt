package com.re4rk.daggerhilt.carExample.di.module

import com.re4rk.daggerhilt.carExample.module.Car
import com.re4rk.daggerhilt.carExample.module.Taxi
import com.re4rk.daggerhilt.carExample.module.engine.Engine
import com.re4rk.daggerhilt.carExample.module.engine.LPG
import com.re4rk.daggerhilt.carExample.module.tier.NormalTire
import com.re4rk.daggerhilt.carExample.module.tier.Tire
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LPGQualifier

@InstallIn(SingletonComponent::class)
@Module
interface TaxiModule {
    @Binds
    @Named("택시")
    fun bindTaxi(taxi: Taxi): Car

    @Binds
    @LPGQualifier
    fun bindLPGEngine(engine: LPG): Engine

    @Binds
    fun bindNormalTire(tire: NormalTire): Tire
}
