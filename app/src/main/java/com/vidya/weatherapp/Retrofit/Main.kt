package com.vidya.weatherapp.Retrofit

import com.google.gson.annotations.SerializedName

class Main {
    @SerializedName("temp")
    var temp: String? = null

    @SerializedName("humidity")
    var humidity: String? = null

    @SerializedName("feels_like")
    var feels_like: String? = null
}