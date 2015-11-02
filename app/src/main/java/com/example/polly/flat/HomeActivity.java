package com.example.polly.flat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
    }

    public void openAlarm(View view) {
        Intent i = new Intent(this, AlarmActivity.class);
        startActivity(i);
    }
    public void openEmail(View view) {
        Intent i = new Intent(this, EmailActivity.class);
        startActivity(i);
    }
    public void openSearch(View view) {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }
    public void openPin(View view) {
        Intent i = new Intent(this, PinActivity.class);
        startActivity(i);
    }
    public void openTask(View view) {
        Intent i = new Intent(this, TaskActivity.class);
        startActivity(i);
    }
    public void openWeather(View view) {
        Intent i = new Intent(this, WeatherActivity.class);
        startActivity(i);
    }
    public void openCalendar(View view) {
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }
}
