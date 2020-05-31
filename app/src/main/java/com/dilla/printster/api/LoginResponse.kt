package com.dilla.printster.api

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("message")
    val message: String?,

    @SerializedName("code")
    val code: Int?,

    @SerializedName("result")
    val result: ResponseString?
)

data class ResponseString(
    @SerializedName("token")
    val token: String?
)