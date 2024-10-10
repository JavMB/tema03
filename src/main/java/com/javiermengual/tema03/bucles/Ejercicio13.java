package com.javiermengual.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int heads = 0, tails = 0;
        final int VECES =100_000_000;
        for (int i = 1; i <= VECES; i++) {
            int result = rand.nextInt(2);
            if (result == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Tenemos los porcentajes de caras de: "+(((float)heads/VECES)*100)
                +" Y un porcentaje de cruzes de : "+(((float)tails/VECES)*100) );


    }
}
