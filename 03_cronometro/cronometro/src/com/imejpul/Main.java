package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro[] almacenCronos = new Cronometro[10];

        char opcion;
        int cont = 0;
        do {
            System.out.println("---Menú---");
            System.out.println("\n" +
                    "    Nuevo cronómetro (N)\n" +
                    "    Consultar cronómetro (C)\n" +
                    "    Salir (S)\n");

            opcion = br.readLine().toLowerCase().charAt(0);

            switch (opcion) {
                case 'n':
                    if (cont < 10) {
                        almacenCronos[cont] = new Cronometro();
                        cont += 1;
                    }
                    break;

                case 'c':
                    System.out.print("Introducir número crono (0..9): ");
                    int crono = Integer.parseInt(br.readLine());
                    almacenCronos[crono].tiempoTranscurrido();
                    break;

                case 's':
                    break;
            }
        } while (opcion != 's');

    }
}
