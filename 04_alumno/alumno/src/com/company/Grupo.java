package com.company;

public class Grupo {

    private String codigo;

    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public Grupo() {

        Alumno[] al = new Alumno[5];

        for (int i = 0; i < 5; i++)

        {

            System.out.println("Introduce datos alumno" + i + 1);

            System.out.print("Nombre: ");
            String nombre = br.readline;

            System.out.print("Apellidos: ");
            String apellidos = br.readline;

            System.out.print("DNI: ");
            String dni = br.readline;

            System.out.print("Teléfono");
            String telefono = br.readline;


            al[i] = new Alumno(nombre, apellidos, dni, telefono);

            System.out.println(al[i].toString());

        }
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
