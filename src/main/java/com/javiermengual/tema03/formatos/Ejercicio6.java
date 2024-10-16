package com.javiermengual.tema03.formatos;

public class Ejercicio6 {
    public static void main(String[] args) {

        String cadena="";
        for (int i = 1; i <=9; i++) {
            cadena=cadena+i;
            System.out.printf("%9s%s",cadena,cadena); //%alinea derecha %- alinea izquierda
            System.out.println();

        }

    }
}
