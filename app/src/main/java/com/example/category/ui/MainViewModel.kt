package com.example.category.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.category.data.source.CategoryRepository
import com.example.category.data.source.remote.CategoryResponse
import kotlinx.coroutines.launch
import java.util.*

class MainViewModel() : ViewModel() {
    private val repository = CategoryRepository()
    val categories = MutableLiveData<List<CategoryResponse>>()

    fun loadCategories() {
        viewModelScope.launch {
            val allCategories = repository.getAllCategories()
//            allCategories.let {
//                categories.postValue(it)
//            }
            if (!allCategories.isNullOrEmpty()) {
                categories.postValue(allCategories)
            } else {
                categories.postValue(listOf(CategoryResponse(
                    id=1,
                    name = "lista vacía",
                    image = "",
                    creationAt = Date(),
                    updatedAt = Date()
                )))
            }
        }
    }
}