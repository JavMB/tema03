package com.javiermengual.tema03.bucles;

public class Ejercicio5 {
    public static void main(String[] args) {
        int contadorPares = 0, contadorImpares = 0, contadorMultiplos5 = 0;
        int sumaPares = 0, sumaImpares = 0, sumaMultiplos5 = 0;

        System.out.println("Números del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ": ");

            // Verificar si es par o impar
            if (i % 2 == 0) {
                System.out.print("Par");
                contadorPares++;
                sumaPares += i;
            } else {
                System.out.print("Impar");
                contadorImpares++;
                sumaImpares += i;
            }

            // Verificar si es múltiplo de 5
            if (i % 5 == 0) {
                System.out.print(", Múltiplo de 5");
                contadorMultiplos5++;
                sumaMultiplos5 += i;
            }

            System.out.println(); // Nueva línea para el siguiente número
        }

        // Mostrar resumen
        System.out.println("\nResumen:");
        System.out.println("Números pares: " + contadorPares + ", Suma: " + sumaPares);
        System.out.println("Números impares: " + contadorImpares + ", Suma: " + sumaImpares);
        System.out.println("Múltiplos de 5: " + contadorMultiplos5 + ", Suma: " + sumaMultiplos5);
    }
}
