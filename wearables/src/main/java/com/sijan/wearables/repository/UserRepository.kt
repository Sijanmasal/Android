package com.sijan.wearables.repository

import com.sijan.wearables.api.MyApiRequest
import com.sijan.wearables.api.ServiceBuilder
import com.sijan.wearables.api.UserAPI
import com.sijan.wearables.entity.User
import com.sijan.wearables.response.LoginResponse

class UserRepository : MyApiRequest() {
    private val userAPI = ServiceBuilder.buildService(UserAPI::class.java)

    suspend fun registerUser(user: User): LoginResponse {
        return apiRequest {
            userAPI.registerUser(user)
        }
    }

    suspend fun checkUser(user_email: String, user_password: String):LoginResponse{
        return apiRequest {
            userAPI.checkUser(user_email, user_password)
        }
    }


}