package com.example.navigacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    ImageView icono,people;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask tarea=new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(tarea, 5000);

        icono=findViewById(R.id.imageView);
        people=findViewById(R.id.rino);
        lottieAnimationView=findViewById(R.id.rino);
        people.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        icono.animate().translationY(1700).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

    }
}