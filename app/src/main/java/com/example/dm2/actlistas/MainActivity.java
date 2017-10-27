package com.example.dm2.actlistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejercicio1(View v){
        Intent Ejer1 = new Intent(MainActivity.this, Ejercicio1.class);
        startActivity(Ejer1);
    }

    public void ejercicio2(View v){
        Intent Ejer2 = new Intent(MainActivity.this, Ejercicio2.class);
        startActivity(Ejer2);
    }

    public void ejercicio3(View v){
        Intent Ejer3 = new Intent(MainActivity.this, Ejercicio3.class);
        startActivity(Ejer3);
    }

}
