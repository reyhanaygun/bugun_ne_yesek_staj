package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarifbalik extends AppCompatActivity {
public Button buttonalti;
public Button buttonyedi;
public Button buttonsekiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifbalik);
        buttonalti=findViewById(R.id.button_alti);
        buttonalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik1=new Intent(tarifbalik.this,tarif5.class);
                startActivity(balik1);
            }
        });
        buttonyedi=findViewById(R.id.button_yedi);
        buttonyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik2=new Intent(tarifbalik.this,tarif6.class);
                startActivity(balik2);
            }
        });
        buttonsekiz=findViewById(R.id.button_sekiz);
        buttonsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik3=new Intent(tarifbalik.this, tarif7.class);
                startActivity(balik3);
            }
        });
    }
}