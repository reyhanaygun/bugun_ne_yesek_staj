package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarifsalata extends AppCompatActivity {
    public Button buttonon;
    public Button buttononbir;
    public Button buttononiki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifsalata);
        buttonon=findViewById(R.id.button_on);
        buttonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salatatarifibir=new Intent(tarifsalata.this,tarif9.class);
                startActivity(salatatarifibir);
            }
        });
        buttononbir=findViewById(R.id.button_onbir);
        buttononbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salatatarifiiki=new Intent(tarifsalata.this,tarif10.class);
                startActivity(salatatarifiiki);
            }
        });
        buttononiki=findViewById(R.id.button_oniki);
        buttononiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salatatarifiuc=new Intent(tarifsalata.this,tarif11.class);
                startActivity(salatatarifiuc);
            }
        });
    }

}