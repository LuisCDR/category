package com.example.category.data

import java.util.Date

data class CategoriesModel(
    val id: Int,
    val name: String,
    val image: String,
    val creationAt: Date,
    val updatedAt: Date
)
