package com.example.firsttestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.android_demo_lib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "This Is Contained In My Second Commit", Toast.LENGTH_SHORT).show();
        HelloWorld.PrintLog("Miki", "Sharoni is doing well");

    }
}