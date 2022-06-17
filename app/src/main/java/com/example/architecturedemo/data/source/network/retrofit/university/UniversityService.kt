package com.example.architecturedemo.data.source.network.retrofit.university

import com.example.architecturedemo.data.entity.university.UniversityNetworkModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UniversityService {
    @GET("search")
    suspend fun getUniversityList(@Query(value = "country") country: String): List<UniversityNetworkModel>
}