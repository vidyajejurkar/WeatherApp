package com.vidya.weatherapp.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather?appid=094aa776d64c50d5b9e9043edd4ffd00")
    fun getWeatherData(@Query("q") name: String?): Call<Example?>?
}