package com.bughra.hatiram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button kunupka;
    TextView javap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kunupka = findViewById(R.id.kunupka);
        javap = findViewById(R.id.javap);
        kunupka.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        javap.setText(R.string.javap1);
    }
}
