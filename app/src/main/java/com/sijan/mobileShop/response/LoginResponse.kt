package com.sijan.mobileShop.response


import com.sijan.mobileShop.entity.User

data class LoginResponse(
    val success :Boolean? = null,
    val token : String? = null,
    val data: User? = null
)
