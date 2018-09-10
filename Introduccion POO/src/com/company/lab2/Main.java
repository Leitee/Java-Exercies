package com.company.lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ejercicio5();
        //ejercicio7();
        //ejercicio10();
    }

    private static void ejercicio5() {
        Papper papper = new Papper();
        Pen pen = new Pen(20);

        pen.write("Hola mundo", papper);

        System.out.println(papper.toString());
    }

    private static void  ejercicio7() {
        final int cebadas = 5;
        var mate = new Mate(cebadas);
        try {
            for (int i = 0; i < cebadas; i++) {
                mate.cebar();
                //mate.cebar();
                mate.beber();
                //mate.beber();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void ejercicio10(){
        RentalItem[] series = new TV_Serie[5];
        RentalItem[] games = new VideoGame[5];

        for (int i = 0; i < series.length; i++) {
            series[i] = new TV_Serie();
        }

        for (int i = 0; i < games.length; i++) {
            games[i] = new VideoGame();
        }

        series[2].rentItem();
        series[4].rentItem();
        games[1].rentItem();

        System.out.println(String.format("There are %d TV series and %d games rented.",
                getRentedItemsQty(series), getRentedItemsQty(games)));
    }

    private static int getRentedItemsQty(RentalItem [] items) {
        int cont = 0;
        for(RentalItem item : items) {
            if(item.isRented()) {
                cont ++;
            }
        }
        return cont;
    }
}
