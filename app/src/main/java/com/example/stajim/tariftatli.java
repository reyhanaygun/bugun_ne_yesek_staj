package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tariftatli extends AppCompatActivity {
    public Button buttononuc;
    public Button buttonondort;
    public Button buttononbes;
    public Button buttononalti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tariftatli);
        buttononuc=findViewById(R.id.button_onuc);
        buttononuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatlibir=new Intent(tariftatli.this,tarif12.class);
                startActivity(tatlibir);
            }
        });
        buttonondort=findViewById(R.id.button_ondort);
        buttonondort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatliiki=new Intent(tariftatli.this,tarif13.class);
                startActivity(tatliiki);
            }
        });
        buttononbes=findViewById(R.id.button_onbes);
        buttononbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatliuc=new Intent(tariftatli.this,tarif14.class);
                startActivity(tatliuc);
            }
        });
        buttononalti=findViewById(R.id.button_onalti);
        buttononalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatlidort=new Intent(tariftatli.this,tarif23.class);
                startActivity(tatlidort);
            }
        });
    }
}