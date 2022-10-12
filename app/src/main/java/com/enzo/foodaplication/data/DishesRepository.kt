package com.enzo.foodaplication.data

import kotlinx.coroutines.flow.Flow

interface DishesRepository {

    suspend fun insertDishes(dish: Dishes)

    suspend fun deleteDishes(dish: Dishes)

    suspend fun getDishesById(id: Int): Dishes?

    fun getDishes(): Flow<List<Dishes>>

}