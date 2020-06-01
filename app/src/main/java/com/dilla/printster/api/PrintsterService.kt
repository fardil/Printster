package com.dilla.printster.api

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

//    private val okHttpClient = OkHttpClient.Builder()
//        .addInterceptor { chain ->
//            val original = chain.request()
//
//            val requestBuilder = original.newBuilder()
//                .method(original.method(), original.body())
//
//            val request = requestBuilder.build()
//            chain.proceed(request)
//        }.build()
//
//    val instance: PrintsterInterface by lazy {
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttpClient)
//            .build()
//
//        retrofit.create(PrintsterInterface::class.java)
//    }
//}

//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level=HttpLoggingInterceptor.Level.BODY
//
//        return OkHttpClient().newBuilder()
//            .addInterceptor(interceptor)
//            .build()
//    }

//    fun getInterceptor() : OkHttpClient {
//        val logging = HttpLoggingInterceptor()
//        logging.level = HttpLoggingInterceptor.Level.BODY
//
//        val okHttpClient = OkHttpClient.Builder()
//            .addInterceptor(logging)
//            .build()
//
//        return okHttpClient
//    }
//
//    //Retrofit
//
//    fun getRetrofit(): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("http://192.168.1.11/")
//            .client(getInterceptor())
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    fun getService() = getRetrofit().create(PrintsterInterface::class.java)
//}

//    private var retrofit: Retrofit? = null
//
//    fun getClient(BASE_URL: String) {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
//
//        if (retrofit == null) {
//            retrofit = Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl(BASE_URL)
//                .client(client)
//                .build()
//        }
//    }
//}

//    private val okHttp = OkHttpClient.Builder()
//
//    fun getClient(BASE_URL: String) {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
//    }
//
//    val instance: PrintsterInterface by lazy{
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttp.build())
//            .build()
//
//        retrofit.create(PrintsterInterface::class.java)
//    }