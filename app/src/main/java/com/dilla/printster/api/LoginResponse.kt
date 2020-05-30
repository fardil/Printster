package com.dilla.printster.api

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("message")
    var message: String,

    @SerializedName("status_code")
    var statusCode: Int,

    @SerializedName("auth_token")
    var authToken: String

)