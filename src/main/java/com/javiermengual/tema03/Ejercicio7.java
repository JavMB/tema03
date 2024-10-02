package com.javiermengual.tema03;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double CUOTA_BASE = 500.0;
        double cuotaFinal = CUOTA_BASE;

        System.out.print("Ingrese la edad del socio: ");
        int edad = scanner.nextInt();

        if (edad > 65) {
            cuotaFinal *= 0.5; // 50% de descuento
        } else if (edad < 18) {
            System.out.print("¿Los padres son socios? (1: Sí, 0: No): ");
            int padresSocios = scanner.nextInt();
            cuotaFinal *= (padresSocios == 1) ? 0.65 : 0.75;
        }

        System.out.printf("La cuota a abonar es: "+ cuotaFinal);
        scanner.close();
    }


    }

