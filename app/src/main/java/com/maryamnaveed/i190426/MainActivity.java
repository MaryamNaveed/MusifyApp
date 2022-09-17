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
    TextView p9;
    TextView p10;
    TextView p11;
    TextView p12;
    TextView p13;
    TextView p14;
    TextView p15;
    TextView p16;
    TextView p17;
    TextView p18;
    TextView p19;
    TextView p20;
    TextView p21;
    TextView p22;
    TextView p23;


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

        p9=findViewById(R.id.p9);

        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage9.class);
                startActivity(intent);
            }
        });

        p10=findViewById(R.id.p10);

        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage10.class);
                startActivity(intent);
            }
        });

        p11=findViewById(R.id.p11);

        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage11.class);
                startActivity(intent);
            }
        });

        p12=findViewById(R.id.p12);

        p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage12.class);
                startActivity(intent);
            }
        });

        p13=findViewById(R.id.p13);

        p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage13.class);
                startActivity(intent);
            }
        });

        p14=findViewById(R.id.p14);

        p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage14.class);
                startActivity(intent);
            }
        });

        p15=findViewById(R.id.p15);

        p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage15.class);
                startActivity(intent);
            }
        });

        p16=findViewById(R.id.p16);

        p16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage16.class);
                startActivity(intent);
            }
        });

        p17=findViewById(R.id.p17);

        p17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivityPage17.class);
                startActivity(intent);
            }
        });
    }
}