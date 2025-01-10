package org.example;

import java.util.Scanner;

public class Ejercicios {

    static Scanner in = new Scanner(System.in);
    public static void titulo() {

        System.out.println("*** SELECCIONA ENTRE LAS SIGUIENTES OPCIONES DE EJERCICIOS ***");
        System.out.println();
        System.out.println("1º: Dígitos.");
        System.out.println("2º: Potencias.");
        System.out.println("3º: Del Revés.");
        System.out.println("4º: Binario.");
        System.out.println("5º: A Binario.");
        System.out.println("6º: Orden Alfabético.");
        System.out.println("7º: Mostrar Suma.");

        restitulo();

        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("   [M] - Volver al menú principal");
        System.out.println("   [X] - Salir");

        respostej();



    }

    public static void restitulo() {
        switch (in.next()){
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            case "x", "X":
                System.exit(0);
            default:
                restitulo();
        }
    }

    public static void respostej() {

        switch (in.next().toUpperCase()){
            case "M":
                //Limpiar pantalla
                titulo();
                break;
            case "X":
                System.exit(0);
            default:
                respostej();
        }

    }

    public static int pedir() {

        System.out.println();
        System.out.println("Introduce el número a calcular:");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("Debe ser un número positivo.");
            pedir();
        }
        return num;
    }

    public static void ejercicio1() {

        int num = pedir();
        System.out.println(ej1Met(num, 0));

    }
    public static int ej1Met(int num, int cont) {

        if (num != 0) {
            num /= 10;
            cont = ej1Met(num, cont + 1);
        }
        return cont;

    }

    public static void ejercicio2() {

        int num = pedir();
        int elevar = pedir();

        System.out.println(ej2Met(num, elevar));



    }
    public static int ej2Met(int num, int elevar) {

        if (elevar != 1) {
            num = ej2Met(num, elevar - 1) * num;
        } else if (elevar == 0) {
            return 1;
        }
        return num;


    }

    public static void ejercicio3() {

        System.out.println("Introduzca '1' para modo cadena");
        System.out.println("Introduzca '2' para modo número");

        switch (in.next()) {
            case "1":
                cadenaEj3();
                break;
            case "2":
                int num = pedir();
                numEj3(num);
                break;
            default:
                ejercicio3();
        }



    }
    public static void cadenaEj3() {



    }
    public static void numEj3(int num) {
        int rest = num % 10;
        if (num != 0) {
            System.out.print(rest);
            numEj3(num / 10);
        }

    }
}
