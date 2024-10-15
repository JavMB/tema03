package com.javiermengual.tema03.formatos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número real: ");
        double numero = entrada.nextDouble();
        System.out.printf("El número con 2 decimales es: %.2f\n", numero);
        entrada.close();


    }
}

