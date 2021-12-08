package com.sijan.mobileShop.response

import com.sijan.mobileShop.entity.Cart

data class CartResponse (
    val success: Boolean? = null,
    val data: MutableList<Cart>? = null
)