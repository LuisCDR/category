package com.example.category.data.source.remote

import com.google.gson.annotations.SerializedName
import java.util.*

data class CategoryResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("image") val image: String,
    @SerializedName("creationAt") val creationAt: Date,
    @SerializedName("updatedAt") val updatedAt: Date
)
