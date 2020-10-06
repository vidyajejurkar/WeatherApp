package com.vidya.weatherapp.Retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Sys {
    @SerializedName("country")
    @Expose
    var country: String? = null

    @SerializedName("sunrise")
    @Expose
    var sunrise: Int? = null

    @SerializedName("sunset")
    @Expose
    var sunset: Int? = null
    fun withCountry(country: String?): Sys {
        this.country = country
        return this
    }

    fun withSunrise(sunrise: Int?): Sys {
        this.sunrise = sunrise
        return this
    }

    fun withSunset(sunset: Int?): Sys {
        this.sunset = sunset
        return this
    }
}