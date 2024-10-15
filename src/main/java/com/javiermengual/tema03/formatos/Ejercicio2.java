package com.javiermengual.tema03.formatos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean esValido;
        int horas, mins, segs;

        do {
            System.out.print("Ingrese la hora (0-23): ");
            horas = Integer.parseInt(entrada.nextLine());
            esValido = horas >= 0 && horas < 24;
            if (!esValido) {
                System.out.println("Error: " + horas + " no es válido.");
                System.out.println("Use formato de 24 horas.");
            }
        } while (!esValido);

        do {
            System.out.print("Ingrese los minutos (0-59): ");
            mins = Integer.parseInt(entrada.nextLine());
            esValido = mins >= 0 && mins < 60;
            if (!esValido) {
                System.out.println("Error: " + mins + " está fuera de rango.");
                System.out.println("Ingrese minutos válidos.");
            }
        } while (!esValido);

        do {
            System.out.print("Ingrese los segundos (0-59): ");
            segs = Integer.parseInt(entrada.nextLine());
            esValido = segs >= 0 && segs < 60;
            if (!esValido) {
                System.out.println("Error: " + segs + " está fuera de rango.");
                System.out.println("Ingrese segundos válidos.");
            }
        } while (!esValido);

        entrada.close();

        System.out.printf("Tiempo válido: %02d:%02d:%02d\n", horas, mins, segs);
    }
}

