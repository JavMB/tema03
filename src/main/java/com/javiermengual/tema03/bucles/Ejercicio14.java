package com.javiermengual.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
       /* 14. Escribe un programa que permita determinar la probabilidad con la que aparece cada uno de los
        valores al lanzar un dado. Para hacerlo, se lanzará el dado 1.000.000 veces y se visualizará
        cuántas veces ha aparecido cada número y el porcentaje que representa del total.*/

        Random rand = new Random();
        final int VECES = 100_000_000;
        int result,
                one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int i = 1; i <= VECES; i++) {
            result = rand.nextInt(1,7);
            switch (result) {
                case 1 -> one++;

                case 2 -> two++;

                case 3 -> three++;

                case 4 -> four++;

                case 5 -> five++;

                case 6 -> six++;

                default -> System.out.println("");
            }

        }
        System.out.println("Tenemos los porcentajes de 1 : " + (((float) one / VECES) * 100));
        System.out.println("Tenemos los porcentajes de 2 : " + (((float) two / VECES) * 100));
        System.out.println("Tenemos los porcentajes de 3 : " + (((float) three / VECES) * 100));
        System.out.println("Tenemos los porcentajes de 4 : " + (((float) four / VECES) * 100));
        System.out.println("Tenemos los porcentajes de 5 : " + (((float) five / VECES) * 100));
        System.out.println("Tenemos los porcentajes de 6 : " + (((float) six / VECES) * 100));




    }
}
