package com.sijan.mobileShop.repository

import com.sijan.mobileShop.api.CartAPI
import com.sijan.mobileShop.api.MyApiRequest
import com.sijan.mobileShop.api.ServiceBuilder
import com.sijan.mobileShop.response.CartResponse

class CartRepository (): MyApiRequest() {
    private val cartAPI= ServiceBuilder.buildService(CartAPI::class.java)

    //Insert Product To cart
    suspend fun addTocart(productId:String,token:String): CartResponse {
        return apiRequest {
            cartAPI.insertCart(token!!,productId)
        }
    }

    //Retrieve cart
    suspend fun getCart(token: String): CartResponse {
        return apiRequest {
            cartAPI.retrieveCart(token!!)
        }
    }

//    ///UpdateCart
//    suspend fun updateCart(token:String,id: String,quantity:Int):CartResponse{
//        return apiRequest {
//            cartAPI.updateCart(token!!,id,quantity)
//        }
//    }

    ///DeleteCart
    suspend fun deleteCart(id: String,token:String):CartResponse{
        return apiRequest {
            cartAPI.deleteCart(token!!,id)
        }
    }



}