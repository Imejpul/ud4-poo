package com.company;

public class Main {

    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce datos alumno" + i+1);

            System.out.print("Nombre: ");
            String nombre = br.readline;

            System.out.print("Apellidos: ");
            String apellidos = br.readline;

            System.out.print("DNI: ");
            String dni = br.readline;

            System.out.print("Teléfono");
            String telefono = br.readline;


            alumnos[i] = new Alumno(nombre, apellidos, dni, telefono);

            System.out.println(alumnos[i].toString());

        }
    }
}
