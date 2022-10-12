package com.enzo.foodaplication.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DishesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(dish: Dishes)

    @Delete
    suspend fun deleteTodo(dish: Dishes)

    @Query("SELECT * FROM dishes WHERE id = :id")
    suspend fun getTodoById(id: Int): Dishes?

    @Query("SELECT * FROM dishes")
    fun getTodos(): Flow<List<Dishes>>

}