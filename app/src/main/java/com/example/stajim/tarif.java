package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarif extends AppCompatActivity {
    public Button buttonbir;
    public Button buttoniki;
    public Button buttonetüc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif);

        buttoniki=findViewById(R.id.button_iki);
        buttoniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ettarifiki=new Intent(tarif.this,tarif2.class);
                startActivity(ettarifiki);
            }
        });



        buttonbir=findViewById(R.id.button_bir);
        buttonbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ettarif=new Intent(tarif.this,tarif1.class);
                startActivity(ettarif);
            }
        });

        buttonetüc=findViewById(R.id.button_etüc);
        buttonetüc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ettarif3=new Intent(tarif.this,tarif24.class);
                startActivity(ettarif3);
            }
        });
    }
}