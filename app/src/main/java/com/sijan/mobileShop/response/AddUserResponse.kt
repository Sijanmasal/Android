package com.sijan.mobileShop.response

import com.sijan.mobileShop.entity.User

data class AddUserResponse(
    val success: Boolean?=null,
    val data : User?= null
)
