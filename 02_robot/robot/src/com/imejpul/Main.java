package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Robot robbie = new Robot();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Introduzca movimiento para robbie: " + "\n" + "Izquierda(X:-1 Y:0), Derecha(X:1,Y:0), Arriba:(X:0,Y:1), Abajo(X:0,Y:-1) ");

            System.out.print("Movimiento en X: ");
            int x = Integer.parseInt(br.readLine());

            System.out.print("Movimiento en Y: ");
            int y = Integer.parseInt(br.readLine());

            robbie.mover(x, y);
        } while (true);

    }

}
