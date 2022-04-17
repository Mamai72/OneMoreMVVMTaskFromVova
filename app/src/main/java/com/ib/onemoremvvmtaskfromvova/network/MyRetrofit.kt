package com.ib.onemoremvvmtaskfromvova

import com.google.gson.GsonBuilder
import com.ib.onemoremvvmtaskfromvova.network.model.RepositoryItem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class MyRetrofit {
    companion object {
        const val BASE_URL =
            "https://api.github.com/"

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .baseUrl(BASE_URL)
            .build()

        val apiService = retrofit.create(KidsApiServiceInterface::class.java)
    }
}

interface KidsApiServiceInterface {
    @GET("/users/grimergrim/repos")
    suspend fun getInfo(): List<RepositoryItem>
}
