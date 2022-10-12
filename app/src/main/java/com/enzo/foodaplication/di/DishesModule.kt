package com.enzo.foodaplication.di

import android.app.Application
import androidx.room.Room
import com.enzo.foodaplication.data.DishesDatabase
import com.enzo.foodaplication.data.DishesRepository
import com.enzo.foodaplication.data.DishesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DishesModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): DishesDatabase {
        return Room.databaseBuilder(
            app,
            DishesDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: DishesDatabase): DishesRepository {
        return DishesRepositoryImpl(db.dao)
    }
}