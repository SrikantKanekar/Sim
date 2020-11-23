package com.example.sim.api.resource

import com.example.sim.api.resource.responses.ResourceDetailResponse
import com.example.sim.api.resource.responses.ResourceResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ResourceApiService {

    @GET("v3/en/encyclopedia/resources")
    suspend fun getAllResources(): List<ResourceResponse>

    @GET("v3/en/encyclopedia/resources/1/{db_letter}")
    suspend fun getResourceById(
        @Path("db_letter") id: Int
    ): ResourceDetailResponse
}