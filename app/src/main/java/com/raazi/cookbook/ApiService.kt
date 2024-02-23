package com.raazi.cookbook

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

private val retrofit : Retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/").addConverterFactory(GsonConverterFactory.create()).build()

val recipeService = retrofit.create(ApiService::class.java)
interface ApiService {
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse
}