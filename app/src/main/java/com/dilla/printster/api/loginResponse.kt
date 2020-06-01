package com.dilla.printster.api

import com.google.gson.annotations.SerializedName

data class loginResponse (
    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("result")
    val result: result
)
