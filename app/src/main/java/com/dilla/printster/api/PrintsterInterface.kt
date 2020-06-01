package com.dilla.printster.api

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Body

interface PrintsterInterface {

    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("email") email:String,
        @Field("phone_number") name:String,
        @Field("password") password:String,
        @Field("confirm_password") confirm_password:String
    ):Call<SignUpResponse>

    @POST("login")
    fun login(@Body info: loginRequest): retrofit2.Call<loginResponse>

}

