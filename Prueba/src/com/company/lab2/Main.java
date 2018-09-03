package com.company.lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

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
        //System.out.print(esContenido("hola", "hola ameo"));
        var matrix = crearMatriz(3,2);
        cargarMatriz(matrix);
        leerMatriz(matrix);
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

    private static int countHi(String subStr, String str) {
        if(str.isEmpty())
        {
            return 0;
        }
        else if(str.indexOf(subStr) > -1)
        {
            return 1+countHi(subStr, str.substring(str.indexOf(str)+2));
        }
        else
        {
            return countHi(subStr, str.substring(1));
        }
    }

    private static boolean esContenido(String subStr, String str) {
        int cont = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subStr.length(); j++) {

                if (str.substring(i) == subStr.substring(j)){
                    for (int k = 0; k < subStr.length(); k++) {
                        if(subStr.substring(i, k) == str.substring(i, k)){
                            cont++;
                        }
                    }
                }
            }
        }

        return false;

    }

    private static int[][] crearMatriz(int fila, int col) {
        return new int[fila] [col];
    }

    private static void cargarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    private static void leerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
