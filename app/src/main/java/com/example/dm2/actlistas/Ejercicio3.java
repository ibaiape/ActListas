package com.example.dm2.actlistas;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Ejercicio3 extends AppCompatActivity {
    private int[] colores =  {Color.WHITE, Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.GRAY};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        final String[] datosLista = new String[] {"Primero","Segundo","Tercero"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datosLista);
        ListView lstOpciones2 = (ListView)findViewById(R.id.lstOpciones2);
        lstOpciones2.setAdapter(adaptador);
        lstOpciones2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id){
                ((TextView)findViewById(R.id.lblElegido)).setText(datosLista[position]);
            }
        });

        Spinner cmbOpciones2 =(Spinner) findViewById(R.id.cmbOpciones2);
        final String[] datosSpinner = new String[] {"Blanco", "Rojo", "Verde", "Amarillo", "Azul", "Gris"};
        adaptador = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, datosSpinner);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones2.setAdapter(adaptador);

        cmbOpciones2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        findViewById(R.id.lblElegido).setBackgroundColor(colores[i]);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        ((TextView)findViewById(R.id.lblElegido)).setText("No se ha realizado ninguna selección");
                    }
                }
        );

    }

}
