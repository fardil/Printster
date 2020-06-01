package com.dilla.printster.api.response

import com.dilla.printster.api.result
import com.google.gson.annotations.SerializedName

data class registerResponse (
    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int
)