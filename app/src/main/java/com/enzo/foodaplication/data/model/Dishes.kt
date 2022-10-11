package com.enzo.foodaplication.data.model

data class Dishes(
    val name: String,
    val ingredient1: Int,
    val ingredient2: Int,
    val ingredient3: Int,
) {
    val kcalSum get() = ingredient1 + ingredient2 + ingredient3
}
