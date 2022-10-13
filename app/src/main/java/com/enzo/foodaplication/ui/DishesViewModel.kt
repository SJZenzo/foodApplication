package com.enzo.foodaplication.ui

import androidx.lifecycle.ViewModel
import com.enzo.foodaplication.data.DishesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DishesViewModel @Inject constructor (
    val repository: DishesRepository
) : ViewModel() {
}