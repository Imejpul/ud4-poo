package com.imejpul;

public class Vuelo {

    //constructor con todos los datos del vuelo (compañia, origen, destino, ...)
    private String compania = "Oceanic Airlines";
    private String origen = "Sydney, Australia";
    private String destino = "Sleepy Ridge";
    private String fecha = "23MAY";
    private int puerta_embarque = 23;
    private int numero_vuelo = 815;
    private int hora = 7;
    private int minutos = 0;

    public String getCompania() {
        return compania;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPuerta_embarque() {
        return puerta_embarque;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
}
