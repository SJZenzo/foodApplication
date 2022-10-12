package com.enzo.foodaplication.data

import kotlinx.coroutines.flow.Flow

class DishesRepositoryImpl (
    private val dao: DishesDao
        ): DishesRepository {

    override suspend fun insertDishes(dish: Dishes) {
        dao.insertTodo(dish)
    }

    override suspend fun deleteDishes(dish: Dishes) {
        dao.deleteTodo(dish)
    }

    override suspend fun getDishesById(id: Int): Dishes? {
        return dao.getTodoById(id)
    }

    override fun getDishes(): Flow<List<Dishes>> {
        return dao.getTodos()
    }
}