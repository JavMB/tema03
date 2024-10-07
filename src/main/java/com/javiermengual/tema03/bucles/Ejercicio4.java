package com.javiermengual.tema03.bucles;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Variable para contar los números impares
        int contador = 0;

        System.out.println("Números impares del 1 al 100:");

        // Bucle para iterar del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Comprobar si el número es impar
            if (i % 2 != 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        // Salto de línea para separar la lista de números del resultado final
        System.out.println("\n");

        // Mostrar el total de números impares
        System.out.println("Total de números impares: " + contador);
    }
}
