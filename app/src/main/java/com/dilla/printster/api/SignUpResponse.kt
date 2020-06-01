package com.dilla.printster.api

import com.google.gson.annotations.SerializedName

data class SignUpResponse (
    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("code")
    val code: Int? = null
)