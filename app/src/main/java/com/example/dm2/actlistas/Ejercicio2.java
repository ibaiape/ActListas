package com.example.dm2.actlistas;

import android.content.Context;
import android.content.Intent;
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
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {
    private Webpage[] datos =
            new Webpage[]{
                    new Webpage("Twitch", "https://go.twitch.tv/",R.drawable.twitch,"Pagina de retransmisiones en directo de videojuegos"),
                    new Webpage("Youtube", "https://www.youtube.com/?hl=es",R.drawable.youtube,"Pagina de visualización de videos varios"),
                    new Webpage("Twitter", "https://twitter.com/",R.drawable.twitter,"Red social centrada en mensajes cortos y abundantes")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        AdaptadorWebpages adaptador = new AdaptadorWebpages(this, datos);
        ListView lstOpciones = (ListView)findViewById(R.id.lstOpciones);
        lstOpciones.setAdapter(adaptador);
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id){
                Intent viewIntent = new Intent("android.intent.action.VIEW",Uri.parse(datos[position].getLink()));
                startActivity(viewIntent);
            }
        });
    }

    class AdaptadorWebpages extends ArrayAdapter<Webpage> {
        public AdaptadorWebpages(Context context, Webpage[] datos) {
            super(context, R.layout.listitem_webpage, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listitem_webpage, null);

            TextView lblNombre = (TextView)item.findViewById(R.id.lblnombre);
            lblNombre.setText(datos[position].getNombre());

            ImageView imgPag = (ImageView)item.findViewById(R.id.imgpag);
            imgPag.setImageResource(datos[position].getImagen());

            TextView lblDescripcion = (TextView)item.findViewById(R.id.lbldesc);
            lblDescripcion.setText(datos[position].getDescripcion());
            return(item);
        }
    }



}
