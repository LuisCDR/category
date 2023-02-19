package com.example.category.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.category.databinding.ActivityMainBinding
import com.example.category.ui.adapter.CategoryAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: MainViewModel by viewModels()
        viewModel.loadCategories()

        val adapter = CategoryAdapter()
        binding.recyclerView.adapter = adapter
        viewModel.categories.observe(this) {
            adapter.categories = it.toMutableList()
        }
    }
}