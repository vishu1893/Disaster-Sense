package com.example.disasterguard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{
    protected Button locationButton,weatherButton,firstAidButton,newsButton,tipsButton,hazardMapsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationButton = (Button) findViewById(R.id.locationButton);
        weatherButton = (Button) findViewById(R.id.weatherButton);
        firstAidButton = (Button) findViewById(R.id.firstAidButton);
        newsButton = (Button) findViewById(R.id.newsButton);
        tipsButton = (Button) findViewById(R.id.tipsButton);
        hazardMapsButton = (Button) findViewById(R.id.hazardMapsButton);

    }
}