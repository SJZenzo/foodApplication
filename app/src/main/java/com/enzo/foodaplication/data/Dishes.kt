package com.enzo.foodaplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dishes(
    val name: String,
    val ingredient1: Int,
    val ingredient2: Int,
    val ingredient3: Int,
    @PrimaryKey val id: Int? = null
) {
    val kcalSum get() = ingredient1 + ingredient2 + ingredient3
}
