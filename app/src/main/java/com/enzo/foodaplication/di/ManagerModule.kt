package com.enzo.foodaplication.di

import com.enzo.foodaplication.manager.DishesManager
import com.enzo.foodaplication.manager.impl.DishesManagerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Binds
    @Singleton
    abstract fun bindDishesMenager(dishesManager: DishesManagerImpl): DishesManager
}