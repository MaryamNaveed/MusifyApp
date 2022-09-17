package com.maryamnaveed.i190426;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityPage18 extends AppCompatActivity {

    BottomNavigationView mNavigationBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page18);

        mNavigationBottom=findViewById(R.id.mNavigationBottom);

        mNavigationBottom.setSelectedItemId(R.id.page_3);
    }
}