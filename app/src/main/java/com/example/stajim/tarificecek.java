package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarificecek extends AppCompatActivity {
    public Button buttonyirmibir;
    public Button buttonyirmiiki;
    public Button buttonyirmiuc;
    public Button buttonyirmidort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarificecek);
        buttonyirmibir=findViewById(R.id.button_yirmibir);
        buttonyirmibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icecek1=new Intent(tarificecek.this,tarif19.class);
                startActivity(icecek1);
            }
        });
        buttonyirmiiki=findViewById(R.id.button_yirmiiki);
        buttonyirmiiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icecek2=new Intent(tarificecek.this,tarif20.class);
                startActivity(icecek2);
            }
        });
        buttonyirmiuc=findViewById(R.id.button_yirmiuc);
        buttonyirmiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icecek3=new Intent(tarificecek.this,tarif21.class);
                startActivity(icecek3);
            }
        });
        buttonyirmidort=findViewById(R.id.button_yirmidort);
        buttonyirmidort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icecek4=new Intent(tarificecek.this,tarif22.class);
                startActivity(icecek4);
            }
        });
    }
}