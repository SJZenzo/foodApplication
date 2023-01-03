package com.enzo.foodaplication.ui.dishesList

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.enzo.foodaplication.ui.dishesDetails.DishesDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DishesListFragment: Fragment() {

    private val viewModel: DishesListViewModel by viewModels()
}