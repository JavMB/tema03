package com.javiermengual.tema03.formatos;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena="";
        int contador =30;
        for (int i = 1; i <=9; i++) {
            cadena=cadena+i;

            if (contador==38){
                contador=30;
            }

            System.out.printf("\u001B[1;"+contador+"m %9s \u001B[0m\n", cadena);
            contador++;
        }


    }
}
