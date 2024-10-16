package com.javiermengual.tema03.formatos;
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena="";
        String cadena2="";
        for (int i = 1; i <=9; i++) {
            cadena=cadena+i;
            System.out.printf("%9s",cadena); //%alinea derecha %- alinea izquierda


            for (int j = i; j <=i ; j++) {
                cadena2=cadena2+j;
                System.out.printf("%s",cadena2);

            }
            System.out.println();
        }

    }
}


