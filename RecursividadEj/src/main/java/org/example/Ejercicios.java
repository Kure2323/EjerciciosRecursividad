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
                int num = pedint();
                System.out.println(ej1Met(num, 0));
                break;
            case "2":
                int num2 = pedint();
                int elevar = pedint();
                System.out.println(ej2Met(num2, elevar));
                break;
            case "3":
                ejercicio3();
                break;
            case "4":
                int binario = pedint();
                ej4Met(binario);
                break;
            case "5":
                int num5 = pedint();
                System.out.println(ej5Met(num5));
                break;
            case "6":
                String alfa = pedirStr();
                palabra6 = alfa.toCharArray();
                ej6Met(palabra6.length);
                break;
            case "7":
                System.out.println(ej7Met(pedint()));
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

    public static int pedint() {

        System.out.println();
        System.out.println("Introduce el número a calcular:");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("Debe ser un número positivo.");
            pedint();
        }
        return num;
    }
    public static String pedirStr() {
        System.out.println();
        System.out.println("Introduce una cadena:");
        return in.next();

    }

    public static int ej1Met(int num, int cont) {

        if (num != 0) {
            num /= 10;
            cont = ej1Met(num, cont + 1);
        }
        return cont;

    }

    public static int ej2Met(int num, int elevar) {

        if (elevar != 1) {
            num = ej2Met(num, elevar - 1) * num;
        } else if (elevar == 0) {
            return 1;
        }
        return num;


    }

    static char palabra3[];
    public static void ejercicio3() {

        System.out.println("Introduzca '1' para modo cadena");
        System.out.println("Introduzca '2' para modo número");

        switch (in.next()) {
            case "1":
                String entrada = pedirStr();
                palabra3 = entrada.toCharArray();
                cadenaEj3(palabra3.length -1);
                break;
            case "2":
                int num = pedint();
                numEj3(num);
                break;
            default:
                ejercicio3();
        }

    }
    public static void cadenaEj3(int len) {

        if (len != 0) {
            System.out.print(palabra3[len]);
            cadenaEj3(len-1);
        }


    }
    public static void numEj3(int num) {
        int rest = num % 10;
        if (num != 0) {
            System.out.print(rest);
            numEj3(num / 10);
        }
    }

    public static void ej4Met(int num) {

        int rest = num % 10;
        if (rest == 0 || rest == 1) {
            if (num == 0 || num == 1) {
                System.out.println("Es un número binario.");
            } else {
                ej4Met(num/10);
            }
        } else {
            System.out.println("No es un número binario.");
        }
    }
    
    public static int ej5Met(int num) {

        if (num != 1) {
            System.out.print(ej5Met(num/2)%2);
        }
        return num%2;


    }

    static char palabra6[];
    public static void ej6Met(int len) {

        if (len != 0) {
            if (len == 2 && palabra6[len-1] >= palabra6[len-2]) {
                System.out.println("Está ordenado alfabéticamente.");
            } else if(palabra6[len-1] >= palabra6[len-2]) {
                ej6Met(len - 1);
            } else {
                System.out.println("No está ordenado alfabéticamente.");
            }
        }
    }

    public static int ej7Met(int num) {

        if (num != 0) {
            num = num + ej7Met(num-1);
        }
        return num;
    }
    //DXC: Calle de las artes gráficas: 7
    //A las 14:45 por el parquecito
}
