package com.example.foodapp.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodapp.modal.FoodImpl
import com.example.foodapp.modal.FoodIntrface
import com.example.foodapp.modal.ListF

class FoodViewModal :ViewModel() {

    private var _foodList: MutableLiveData<List<ListF>> = MutableLiveData(emptyList())
    val foodList: LiveData<List<ListF>> get() = _foodList
    private val repository: FoodIntrface = FoodImpl()

    init {
        getListOfFood()
    }

    fun getListOfFood(){
        _foodList.value = repository.getFoodList()
    }
}