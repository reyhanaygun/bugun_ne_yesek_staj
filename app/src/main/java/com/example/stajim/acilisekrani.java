package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class acilisekrani extends AppCompatActivity {
    ImageView acilisresmi;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_acilisekrani);
        acilisresmi = findViewById(R.id.acilisimg);
        lottieAnimationView = findViewById(R.id.animationView);


        final Intent i = new Intent(acilisekrani.this, MainActivity.class);
        Thread zamanlama = new Thread() {
            @Override
            public void run() {
            try{
                sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            finally {
                startActivity(i);
                finish();
            }
            }


        };
        zamanlama.start();
    }
}
