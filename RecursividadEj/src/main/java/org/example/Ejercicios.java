package org.example;

import java.util.Scanner;

public class Ejercicios {

    static Scanner in = new Scanner(System.in);
    public static void titulo() {

        System.out.println("*** ESCOGE ENTRE LAS SIGUIENTES OPCIONES DE EJERCICIOS ***");
        System.out.println();
        System.out.println("1º: Ejemplo de inicio.");
        System.out.println("2º: Ejemplo 2.");

    }

    public static void restitulo() {
        switch (in.next()){
            case "1":
                //Insertar método del ejercicio
                break;
            case "2":
                //Insertar método del ejercicio
                break;
            default:
                return;
        }


    }

}
