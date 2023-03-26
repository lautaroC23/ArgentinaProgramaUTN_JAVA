package org.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numero;
        Scanner scn = new Scanner(System.in);
        Persona unaPersona = new Persona();
        ArrayList<Persona> listaDePersonas = new ArrayList<>();

        System.out.println("Tipee 1 para ingresar una persona y 0 para terminar");
        numero = Integer.parseInt(scn.nextLine());

        while(numero != 0){
            System.out.println("Ingrese Nombre");
            unaPersona.setNombre(scn.nextLine());

            System.out.println("Ingrese apellido");
            unaPersona.setApellido(scn.nextLine());

            System.out.println("Ingrese fecha de nacimiento dd/mm/aaaa");
            unaPersona.setFechaNacimiento(scn.nextLine());

            listaDePersonas.add(unaPersona);

            System.out.println("Tipee 1 para ingresar una persona y 0 para terminar");
            numero = Integer.parseInt(scn.nextLine());
        }

        System.out.println("Listado de personas\n");
        for(Persona pers : listaDePersonas){
            System.out.println(pers.toString() + "\n");
        }
    }
}
