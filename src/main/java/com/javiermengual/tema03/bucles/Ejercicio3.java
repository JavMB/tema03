package com.javiermengual.tema03.bucles;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular el producto usando sumas
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        // Mostrar el resultado
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + resultado);

        scanner.close();
    }
}


