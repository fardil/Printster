package com.dilla.printster.api.model

import com.google.gson.annotations.SerializedName

data class user (
    @SerializedName("id_user")
    var id: Int,

    @SerializedName("email")
    var email: String,

    @SerializedName("phone_number")
    var phoneNumber: String,

    @SerializedName("password")
    var password: String
)