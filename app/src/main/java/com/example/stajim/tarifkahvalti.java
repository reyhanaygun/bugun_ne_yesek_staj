package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarifkahvalti extends AppCompatActivity {
    public Button buttononyedi;
    public Button buttononsekiz;
    public Button buttonondokuz;
    public Button buttonyirmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifkahvalti);
        buttononyedi=findViewById(R.id.button_onyedi);
        buttononyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kahvaltitarif1=new Intent(tarifkahvalti.this,tarif15.class);
                startActivity(kahvaltitarif1);
            }
        });
        buttononsekiz=findViewById(R.id.button_onsekiz);
        buttononsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kahvaltitarif2=new Intent(tarifkahvalti.this,tarif17.class);
                startActivity(kahvaltitarif2);
            }
        });
        buttonondokuz=findViewById(R.id.button_ondokuz);
        buttonondokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kahvaltitarif3=new Intent(tarifkahvalti.this,tarif16.class);
                startActivity(kahvaltitarif3);
            }
        });
        buttonyirmi=findViewById(R.id.button_yirmi);
        buttonyirmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kahvaltitarif4=new Intent(tarifkahvalti.this,tarif18.class);
                startActivity(kahvaltitarif4);
            }
        });
    }
}