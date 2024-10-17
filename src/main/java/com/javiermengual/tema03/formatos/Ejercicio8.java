package com.javiermengual.tema03.formatos;


public class Ejercicio8 {
    public static void main(String[] args) {
        final int NEGRITAS=2;
        final int COLOR=37;
        final int FONDO=47;


        for (int i = 0; i <NEGRITAS ; i++) {

            for (int j = 30; j <=COLOR ; j++) {

                for (int k = 40; k <= FONDO ; k++) {
                    String color = i + ";" +j + ";" + k;
                    System.out.printf("\u001B["+i+";"+j+";"+k+"m%8s\u001B[0m", color);

                }
                System.out.println();


            }
        }

    }

}



