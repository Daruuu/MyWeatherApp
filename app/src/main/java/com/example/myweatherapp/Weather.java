package com.example.myweatherapp;


import static android.provider.Settings.Secure.getString;

import com.android.volley.RequestQueue;

// agregar volley
public class Weather {
    private final String URL_API = "https://api.openweathermap.org/data/2.5/weather";
    private String API_KEY;
//    private final String API_KEY = getString(R.string.api_key_weather);

    private RequestQueue requestQueue;

    public Weather(RequestQueue requestQueue, String API_KEY) {
        this.requestQueue = requestQueue;
        this.API_KEY = API_KEY;
    }

//    public void getCurrentWather(String city, weatherCallback callback) {
//        String url = URL_API + "?q=" + city + "&appid" + API_KEY;
//        Jso
//    }

}
