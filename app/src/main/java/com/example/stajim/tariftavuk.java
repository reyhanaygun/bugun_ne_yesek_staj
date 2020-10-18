package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tariftavuk extends AppCompatActivity {
public Button buttonuc;
public Button buttondort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tariftavuk);
    buttonuc=findViewById(R.id.button_uc);
    buttonuc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tavuktarifi=new Intent(tariftavuk.this,tarif3.class);
            startActivity(tavuktarifi);
        }

    });
    buttondort=findViewById(R.id.button_dort);
    buttondort.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tavuktarifiiki=new Intent(tariftavuk.this,tarif4.class);
            startActivity(tavuktarifiiki);
        }
    });
    }
}