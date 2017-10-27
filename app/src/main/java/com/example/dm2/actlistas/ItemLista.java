package com.example.dm2.actlistas;

public class ItemLista {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ItemLista(String m){
        mensaje=m;
    }
}