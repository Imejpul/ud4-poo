package com.imejpul;

public class Tarjeta_Embarque {

    //constructor (inicializando clases pasajero y vuelo) con todos los datos (asiento,zona,clase)
    private String asiento = "42B";
    private int zona = 4;
    private char clase = 'C';

    public void visualizar() {

        Pasajero pas = new Pasajero();
        Vuelo vue = new Vuelo();

        //Datos Pasajero
        System.out.println("Nombre Pasajero: " + pas.getNombre());
        System.out.println("Teléfono: " + pas.getTelefono());
        System.out.println("Número de Maletas: " + pas.getCantidad_maletas());

        //Datos Vuelo
        System.out.println("Compañía: " + vue.getCompania());
        System.out.println("Origen: " + vue.getOrigen());
        System.out.println("Destino: " + vue.getDestino());
        System.out.println("Fecha: " + vue.getFecha());
        System.out.println("Puerta Embarque: " + vue.getPuerta_embarque());
        System.out.println("Número Vuelo: " + vue.getNumero_vuelo());
        System.out.println("Hora: " + vue.getHora() + ":" + vue.getMinutos());
        System.out.println("Asiento: " + asiento);

        //Datos Tarjeta Embarque
        System.out.println("Número Asiento: " + asiento);
        System.out.println("Zona: " + zona);
        System.out.println("Clase: " + clase);
    }

}
