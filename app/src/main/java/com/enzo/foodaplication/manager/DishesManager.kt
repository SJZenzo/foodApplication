package com.enzo.foodaplication.manager

import com.enzo.foodaplication.data.model.Dishes

interface DishesManager {
    fun init()
    fun add(dish: Dishes)
    fun set(index: Int, dish: Dishes)
    fun get(index: Int): Dishes
    fun getAll(): List<Dishes>
    fun remove(index: Int)
}