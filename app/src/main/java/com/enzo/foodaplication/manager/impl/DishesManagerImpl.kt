package com.enzo.foodaplication.manager.impl

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.enzo.foodaplication.consts.Consts
import com.enzo.foodaplication.data.model.Dishes
import com.enzo.foodaplication.manager.DishesManager
import com.enzo.foodaplication.utils.fromJson
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class DishesManagerImpl(
    @ApplicationContext private val context: Context,
    private val gson: Gson
): DishesManager{

    private val diashesList = mutableListOf<Dishes>()
    private val dishesListDataStoreJsonKey =
        stringPreferencesKey(Consts.DISHES_LIST_STORAGE_KEY_NAME)
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    private val Context.dishesListDataStore: DataStore<Preferences> by preferencesDataStore(
        name = Consts.DISHES_LIST_STORAGE_NAME
    )

    override fun init() {
        coroutineScope.launch {
            diashesList.clear()
            diashesList.addAll(context.loadDishesList())
        }
    }

    override fun add(dish: Dishes) {
        TODO("Not yet implemented")
    }

    override fun set(index: Int, dish: Dishes) {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): Dishes {
        TODO("Not yet implemented")
    }

    override fun getAll() {
        TODO("Not yet implemented")
    }

    override fun remove() {
        TODO("Not yet implemented")
    }

    private suspend fun Context.loadDishesList() =
        dishesListDataStore.data.map { preferences ->
            preferences[dishesListDataStoreJsonKey]?.let {
                gson.fromJson<List<Dishes>>(it)
            } ?: listOf()
        }.first()

    private suspend fun Context.savePizzasList(pizzasList: List<Dishes>) =
        dishesListDataStore.edit { preferences ->
            preferences[dishesListDataStoreJsonKey] = gson.toJson(pizzasList)
        }

}