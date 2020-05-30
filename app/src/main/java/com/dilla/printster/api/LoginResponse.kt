package com.dilla.printster.api

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("message")
    var message: String,

    @SerializedName("code")
    var code: Int,

    @SerializedName("token")
    var token: String

)