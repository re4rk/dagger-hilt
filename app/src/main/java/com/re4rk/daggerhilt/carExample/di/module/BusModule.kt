package com.re4rk.daggerhilt.carExample.di.module

import com.re4rk.daggerhilt.carExample.module.Bus
import com.re4rk.daggerhilt.carExample.module.Car
import com.re4rk.daggerhilt.carExample.module.engine.Diesel
import com.re4rk.daggerhilt.carExample.module.engine.Engine
import com.re4rk.daggerhilt.carExample.module.tier.BusTire
import com.re4rk.daggerhilt.carExample.module.tier.Tire
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import javax.inject.Named
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DieselQualifier

@InstallIn(ActivityRetainedComponent::class)
@Module
object BusModule {
    @Provides
    @Named("버스")
    fun provideBus(
        @DieselQualifier engine: Engine,
        @Named("버스타이어") tire: Tire,
    ): Car = Bus(engine).apply { this.tire = tire }

    @Provides
    @DieselQualifier
    fun provideDieselEngine(): Engine = Diesel()

    @Provides
    @Named("버스타이어")
    fun provideBusTire(): Tire = BusTire()
}
