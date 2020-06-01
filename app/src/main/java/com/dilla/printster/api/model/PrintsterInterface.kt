package com.dilla.printster.api.model

import com.dilla.printster.api.request.loginRequest
import com.dilla.printster.api.request.registerRequest
import com.dilla.printster.api.response.loginResponse
import com.dilla.printster.api.response.registerResponse
import retrofit2.http.POST
import retrofit2.http.Body

interface PrintsterInterface {

    @POST("register")
    fun register(@Body info: registerRequest): retrofit2.Call<registerResponse>

    @POST("login")
    fun login(@Body info: loginRequest): retrofit2.Call<loginResponse>

}

