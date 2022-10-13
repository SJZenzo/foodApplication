package com.enzo.foodaplication.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Dishes::class],
    version = 1
)

abstract class DishesDatabase : RoomDatabase(){

    abstract val dao: DishesDao

}