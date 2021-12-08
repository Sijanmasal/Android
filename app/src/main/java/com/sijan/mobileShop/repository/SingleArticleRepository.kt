package com.sijan.mobileShop.repository

import com.sijan.mobileShop.api.MyApiRequest
import com.sijan.mobileShop.api.ServiceBuilder
import com.sijan.mobileShop.api.SingleArticleAPI

import com.sijan.mobileShop.response.ArticleResponse


class SingleArticleRepository: MyApiRequest() {
    private val singleArticleAPI = ServiceBuilder.buildService(SingleArticleAPI::class.java)

    //Display Single Article
    suspend fun getSingleArticle(id:String): ArticleResponse {
        return apiRequest {
            singleArticleAPI.showSingleArticle(id)
        }
    }
}