package com.sijan.mobileShop.repository

import com.sijan.mobileShop.api.MyApiRequest
import com.sijan.mobileShop.api.ServiceBuilder
import com.sijan.mobileShop.api.UserAPI
import com.sijan.mobileShop.entity.User
import com.sijan.mobileShop.response.LoginResponse

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

    //Retrieve User
    suspend fun userDetails(token:String,userToken:String): LoginResponse {
        return apiRequest {
            userAPI.retrieveUser(ServiceBuilder.token!!,userToken)
        }
    }

}