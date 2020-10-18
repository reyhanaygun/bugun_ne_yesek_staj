package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarifsebze extends AppCompatActivity {
 public Button dokuz;
 public Button tavukiki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifsebze);
        dokuz=findViewById(R.id.button_dokuz);
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sebzetarif1=new Intent(tarifsebze.this, tarif8.class);
                startActivity(sebzetarif1);
            }
        });
        tavukiki=findViewById(R.id.button_tavukiki);
        tavukiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sebzetarif2=new Intent(tarifsebze.this, tarif25.class);
                startActivity(sebzetarif2);
            }
        });
    }
}