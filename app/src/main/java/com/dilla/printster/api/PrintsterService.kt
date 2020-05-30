package com.dilla.printster.api

import android.util.Base64
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PrintsterService {

    private const val BASE_URL: String = "http://192.168.1.11/"

    private val okHttp = OkHttpClient.Builder()

    val instance: PrintsterInterface by lazy{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp.build())
            .build()

        retrofit.create(PrintsterInterface::class.java)
    }
    //Create OkHttp Client
    //private val okHttp = OkHttpClient.Builder()

    //Create Retrofit Builder
    /*private val builder = Retrofit.Builder().baseUrl(URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(okHttp.build())

    //Create Retrofit Instance
    private val retrofit = builder.build()

    fun<T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }*/


    /*fun create(): PrintsterService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("localhost:8000/")
            .build()
        return retrofit.create(PrintsterService::class.java)
    }*/
}