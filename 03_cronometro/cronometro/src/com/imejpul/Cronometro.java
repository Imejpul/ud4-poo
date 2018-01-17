package com.imejpul;

public class Cronometro {

    private long horaInicio = System.nanoTime();

    public void tiempoTranscurrido(){

        long tiempoTrans = System.nanoTime() - horaInicio;

        System.out.println("Han transcurrido: " + tiempoTrans +  " nanosegundos");
    }
}
