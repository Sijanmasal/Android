package com.sijan.mobileShop.response


import com.sijan.mobileShop.entity.Product

data class ProductResponse(
        val success : Boolean? = null,
        val data: MutableList<Product>? = null
)
