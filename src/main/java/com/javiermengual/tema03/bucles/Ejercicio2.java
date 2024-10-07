package com.javiermengual.tema03.bucles;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variable para almacenar la suma
        int suma = 0;

        // Bucle para sumar los números del 1 al 1000
        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }

        // Imprimir el resultado
        System.out.println("La suma de los números del 1 al 1000 es: " + suma);
    }
}
