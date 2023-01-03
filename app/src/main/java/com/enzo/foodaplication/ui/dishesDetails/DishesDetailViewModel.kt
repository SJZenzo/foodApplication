package com.enzo.foodaplication.ui.dishesDetails

import androidx.lifecycle.ViewModel
import com.enzo.foodaplication.manager.DishesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DishesDetailViewModel @Inject constructor(
    val dishesMenager: DishesManager
): ViewModel() {
}