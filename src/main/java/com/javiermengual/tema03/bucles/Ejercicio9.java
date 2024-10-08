package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        boolean esPrimo = n > 1; //  los primos son mayores que 1

        for (int i = 2; i * i <= n && esPrimo; i++) { // i * i <= n  limita el bucle hasta la raiz cuadrada de n
            if (n % i == 0) esPrimo = false;
        }

        System.out.println(n + (esPrimo ? " es primo" : " no es primo"));
        scanner.close();
    }
}
