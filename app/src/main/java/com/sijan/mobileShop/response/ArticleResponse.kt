package com.sijan.mobileShop.response

import com.sijan.mobileShop.entity.Article

data class ArticleResponse(
        val success : Boolean? = null,
        val data: MutableList<Article>? = null
)
