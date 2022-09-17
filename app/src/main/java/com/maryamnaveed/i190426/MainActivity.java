package com.maryamnaveed.i190426;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView p1;
    TextView p2;
    TextView p3;
    TextView p4;
    TextView p5;
    TextView p6;
    TextView p7;
    TextView p8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1=findViewById(R.id.p1);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage1.class);
                startActivity(intent);
            }
        });

        p2=findViewById(R.id.p2);

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage2.class);
                startActivity(intent);
            }
        });

        p3=findViewById(R.id.p3);

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage3.class);
                startActivity(intent);
            }
        });

        p4=findViewById(R.id.p4);

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage4.class);
                startActivity(intent);
            }
        });

        p5=findViewById(R.id.p5);

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage5.class);
                startActivity(intent);
            }
        });

        p6=findViewById(R.id.p6);

        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage6.class);
                startActivity(intent);
            }
        });

        p7=findViewById(R.id.p7);

        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage7.class);
                startActivity(intent);
            }
        });

        p8=findViewById(R.id.p8);

        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage8.class);
                startActivity(intent);
            }
        });
    }
}