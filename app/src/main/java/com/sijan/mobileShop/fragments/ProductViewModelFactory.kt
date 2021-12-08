package com.sijan.mobileShop.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sijan.mobileShop.repository.ProductRepository

class ProductViewModelFactory(val repository: ProductRepository):ViewModelProvider.Factory{
    override fun <T:ViewModel?> create(modelClass:Class<T>):T{
        return ProductViewModel(repository) as T
    }
}