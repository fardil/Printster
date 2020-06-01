package com.dilla.printster.api.response

import com.dilla.printster.api.result
import com.google.gson.annotations.SerializedName

data class loginResponse (
    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("result")
    val result: result
)
