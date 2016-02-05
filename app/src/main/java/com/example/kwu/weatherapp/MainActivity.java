package com.example.kwu.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String API_KEY = "6e9c4bced2c2ac9edcfe5a2bc7337f6f";

    private static final String URL = "https://api.forecast.io/forecast/%s/%f,%f";

    private double latitude = 45.5200;

    private double longitude = -122.6819;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
