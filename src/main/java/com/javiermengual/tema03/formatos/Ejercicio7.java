package com.javiermengual.tema03.formatos;

public class Ejercicio7 {
    public static void main(String[] args) {
        String ascendientes = "";

        for (int i = 1; i <= 9; i++) {
            ascendientes = ascendientes + i;
            System.out.printf("%9s", ascendientes); //%alinea derecha %- alinea izquierda

            for (int j = i; j > 0; j--) {
                System.out.printf("%s", j);
            }
            System.out.println();
        }



    }
}


