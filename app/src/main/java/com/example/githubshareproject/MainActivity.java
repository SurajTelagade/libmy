package com.example.githubshareproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.libary.Toster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toster.simpleToast(this,"Suraj this you");
    }
}