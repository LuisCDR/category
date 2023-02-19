package com.example.category.data.source.remote

import retrofit2.Call
import retrofit2.http.GET

interface CategoryService {
    @GET("categories")
    fun getAllCategories() : Call<List<CategoryResponse>>
}