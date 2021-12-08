package com.sijan.wearables.response

import com.sijan.wearables.entity.User

data class LoginResponse(
    val success :Boolean? = null,
    val token : String? = null,
    val data: MutableList<User>? = null
)
