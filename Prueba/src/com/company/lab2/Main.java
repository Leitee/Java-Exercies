package com.company.lab2;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("There are " + Array.getLength(args) + " params.");

        for (var arg : args){
            System.out.println("Hello " + arg);
        }

        Account ac = new Account(100, 1234);
        ac.credit(50);
        ac.debit(200);
        System.out.println(ac.toString());*/

        //dibujar(5,7);
        //System.out.print(factorial(5));
        //System.out.print((prime(5) ? "Es primo" : "No es primo"));
        //System.out.print(fibonacci(-2));
        System.out.print(reverse("Hola Ameo"));
    }

    private static void dibujar(int altura , int anchura) {
        for (int alto = 0; alto < altura; alto++) {
            for (int ancho = 0; ancho < anchura; ancho++) {
                if(alto == 0 || alto == altura-1 || ancho == 0 ) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    private static int factorial(int numero) {
        return numero == 0 ? 1 : numero * factorial(numero -1);
    }

    private static boolean prime(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++)
            if ((numero % i) == 0) {
                contador++;
            }
        return contador >=2;
    }

    private static int fibonacci(int numero) throws RuntimeException {
        return (numero == 0 || numero == 1) ? numero : fibonacci(numero -1) + fibonacci(numero -2);
    }

    private static String reverse(String str) {
        return (str.length() <= 1) ? str : reverse(str.substring(1)) + str.charAt(0);
    }
}
