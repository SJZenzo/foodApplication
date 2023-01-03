package com.enzo.foodaplication.ui.dishesDetails

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DishesDetailFragmet: Fragment() {

    private val viewModel: DishesDetailViewModel by viewModels()
}