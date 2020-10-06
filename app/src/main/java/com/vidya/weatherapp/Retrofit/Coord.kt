package com.vidya.weatherapp.Retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Coord {
    @SerializedName("lon")
    @Expose
    var lon: Double? = null

    @SerializedName("lat")
    @Expose
    var lat: Double? = null
    fun withLon(lon: Double?): Coord {
        this.lon = lon
        return this
    }

    fun withLat(lat: Double?): Coord {
        this.lat = lat
        return this
    }
}