package com.dilla.printster.api.model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PrintsterService {

    val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    val client: OkHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(interceptor)
    }.build()

    fun getPrintsterService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.11:8000")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}
