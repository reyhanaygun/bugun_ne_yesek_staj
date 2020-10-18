package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tarifegit;
    public TextView tavuktarifinegit;
    public TextView baliktariflerinegit;
    public TextView sebzetariflerinegit;
    public TextView salatatariflerinegit;
    public TextView tatlitariflerinegit;
    public TextView kahvaltitariflerinegit;
    public TextView icecektariflerinegit;
    public TextView evdekimalzemeleregit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tavuktarifinegit=findViewById(R.id.tavuktarifleri);
        tavuktarifinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tavuktarif=new Intent(MainActivity.this,tariftavuk.class);
                startActivity(tavuktarif);
            }
        });

        tarifegit=findViewById(R.id.ettarifleri);
        tarifegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ettarif=new Intent(MainActivity.this,tarif.class);
                startActivity(ettarif);
            }


        });
        baliktariflerinegit=findViewById(R.id.baliktarifleri);
        baliktariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baliktarifi=new Intent(MainActivity.this,tarifbalik.class);
                startActivity(baliktarifi);
            }
        });
        sebzetariflerinegit=findViewById(R.id.sebzetarifleri);
        sebzetariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sebzetarifi=new Intent(MainActivity.this, tarifsebze.class);
                startActivity(sebzetarifi);
            }
        });
        tatlitariflerinegit=findViewById(R.id.tatlitarifleri);
        tatlitariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatlitarifi=new Intent(MainActivity.this,tariftatli.class);
                startActivity(tatlitarifi);

            }
        });
        salatatariflerinegit=findViewById(R.id.salatatarifleri);
        salatatariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salatatarifi=new Intent(MainActivity.this,tarifsalata.class);
                startActivity(salatatarifi);
            }
        });
        kahvaltitariflerinegit=findViewById(R.id.kahvaltitarifleri);
        kahvaltitariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kahvaltitarif=new Intent(MainActivity.this,tarifkahvalti.class);
                startActivity(kahvaltitarif);
            }
        });
        icecektariflerinegit=findViewById(R.id.icecektarifleri);
        icecektariflerinegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icecektarif=new Intent(MainActivity.this,tarificecek.class);
                startActivity(icecektarif);
            }
        });
        evdekimalzemeleregit=findViewById(R.id.evdekimalzemeler);
        evdekimalzemeleregit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent evdekimalzemeler=new Intent(MainActivity.this, evdekimalzemeler.class);
                startActivity(evdekimalzemeler);
            }
        });
    }
}