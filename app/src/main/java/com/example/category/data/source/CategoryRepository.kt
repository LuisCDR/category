package com.example.category.data.source

import com.example.category.data.source.remote.CategoryRemoteDataSource
import com.example.category.data.source.remote.CategoryResponse

class CategoryRepository () {
    private val remoteDataSource = CategoryRemoteDataSource()

    suspend fun getAllCategories(): List<CategoryResponse> {
        return remoteDataSource.getAllCategories()
    }
}