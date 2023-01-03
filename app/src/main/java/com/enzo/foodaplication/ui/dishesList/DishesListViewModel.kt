package com.enzo.foodaplication.ui.dishesList

import androidx.lifecycle.ViewModel
import com.enzo.foodaplication.manager.DishesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DishesListViewModel @Inject constructor(
    val dishesMenager: DishesManager
): ViewModel() {
}