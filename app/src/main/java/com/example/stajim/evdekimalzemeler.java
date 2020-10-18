package com.example.stajim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class evdekimalzemeler extends AppCompatActivity
{
    private CheckBox etcheck, tavukcheck, balikcheck, patatescheck,kiymacheck,biberiyecheck,havuccheck, sogancheck,brokolicheck;
    private Button buttoncheck;
    private TextView textcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evdekimalzemeler);

        etcheck = findViewById(R.id.et);
        tavukcheck = findViewById(R.id.tavuk);
        balikcheck = findViewById(R.id.balik);
        patatescheck = findViewById(R.id.patates);
        kiymacheck=findViewById(R.id.kiyma);
        biberiyecheck=findViewById(R.id.biberiye);
        havuccheck=findViewById(R.id.havuc);
        sogancheck=findViewById(R.id.sogan);
        brokolicheck=findViewById(R.id.brokoli);

        buttoncheck = findViewById(R.id.cbbuton);
        textcheck = findViewById(R.id.cbsonuc);


        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";
                {
                    if (etcheck.isChecked()|| etcheck.isChecked() && biberiyecheck.isChecked()) {

                        textcheck.setText(getResources().getText(R.string.ettarifibir));
                    }
                    else
                        textcheck.setText("Seçtiğiniz malzemelere göre bir tarif bulunamadı.");
                }

                if(kiymacheck.isChecked() ){

                    textcheck.setText(getResources().getText(R.string.ettarifiiki));
                }

                if(tavukcheck.isChecked()){
                    textcheck.setText(getResources().getText(R.string.tavuktarifibir));
                }
                if(patatescheck.isChecked() && tavukcheck.isChecked()){
                    textcheck.setText(getResources().getText(R.string.sebzetarifiiki ));
                }
                if(balikcheck.isChecked()){
                    textcheck.setText(getResources().getText(R.string.baliktarifiiki));
                }
                if(patatescheck.isChecked() && havuccheck.isChecked() && brokolicheck.isChecked() ){
                    textcheck.setText(getResources().getText(R.string.sebzetarifibir));
                }
                if(patatescheck.isChecked() && sogancheck.isChecked() ){
                    textcheck.setText(getResources().getText(R.string.salatatarifibir));
                }
                if(!patatescheck.isChecked() && !havuccheck.isChecked() && !brokolicheck.isChecked() &&!sogancheck.isChecked() && !kiymacheck.isChecked() && !biberiyecheck.isChecked() &&!etcheck.isChecked() && !tavukcheck.isChecked() && !balikcheck.isChecked()){
                    textcheck.setText("Lütfen bir malzeme seçiniz");
                }

            }

        });

        }
    }

