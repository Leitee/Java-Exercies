package com.company.lab2;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        System.out.println("There are " + Array.getLength(args) + " params.");

        for (var arg : args){
            System.out.println("Hello " + arg);
        }

        Account ac = new Account(100, 1234);
        ac.credit(50);
        ac.debit(200);
        System.out.println(ac.toString());
    }
}
