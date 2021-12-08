package com.sijan.mobileShop.repository

import com.sijan.mobileShop.api.MyApiRequest
import com.sijan.mobileShop.api.ServiceBuilder
import com.sijan.mobileShop.api.SingleProductAPI
import com.sijan.mobileShop.response.ProductResponse

class SingleProductRepository: MyApiRequest() {
    private val singleProductAPI = ServiceBuilder.buildService(SingleProductAPI::class.java)

    //Display Single Product
    suspend fun getSingleProduct(id:String):ProductResponse{
        return apiRequest {
            singleProductAPI.showSingleProduct(id)
        }
    }
}