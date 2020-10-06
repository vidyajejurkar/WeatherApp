package com.vidya.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.vidya.weatherapp.Retrofit.ApiClient.client
import com.vidya.weatherapp.Retrofit.ApiInterface
import com.vidya.weatherapp.Retrofit.Example
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
   lateinit var search: ImageView
    var tempText: TextView? = null
    var descText: TextView? = null
    var humidityText: TextView? = null
    lateinit var textField: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        search = findViewById(R.id.search)
        tempText = findViewById(R.id.tempText)
        descText = findViewById(R.id.descText)
        humidityText = findViewById(R.id.humidityText)
        textField = findViewById(R.id.textField)
        this.search.setOnClickListener(View.OnClickListener { getWeatherData(textField.text.toString().trim { it <= ' ' }) })
    }

    private fun getWeatherData(name: String) {
        val apiInterface = client!!.create(ApiInterface::class.java)
        val call = apiInterface.getWeatherData(name)
        call!!.enqueue(object : Callback<Example> {
            override fun onResponse(call: Call<Example>, response: Response<Example>) {

                    tempText!!.text = "Temp" + " " + response.body()!!.main!!.temp
                    descText!!.text = "Feels Like" + " " + response.body()!!.main!!.feels_like
                    humidityText!!.text = "Humidity" + " " + response.body()!!.main!!.humidity

            }

            override fun onFailure(call: Call<Example>, t: Throwable) {}
        })
    }
}

private fun <T> Call<T>.enqueue(callback: Callback<Example>) {

}
