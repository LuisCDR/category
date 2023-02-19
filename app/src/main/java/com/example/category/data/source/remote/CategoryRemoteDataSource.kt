package com.example.category.data.source.remote

import com.example.category.api.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryRemoteDataSource() {
    suspend fun getAllCategories(): List<CategoryResponse> {
        return withContext(Dispatchers.IO) {
            val categoryService = RetrofitService.create(CategoryService::class.java).getAllCategories()
            val response = categoryService.execute()
            response.body() ?: emptyList()
        }


    }
}