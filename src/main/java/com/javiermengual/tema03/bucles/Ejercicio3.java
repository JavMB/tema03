package com.javiermengual.tema03.bucles;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        int signoA,signoB;

        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        signoA=num1<0?-1:1;
        num1*=signoA;
        signoB=num2<0?-1:1;
        num2*=signoB;



        // Calcular el producto usando sumas
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        // Mostrar el resultado


        resultado=resultado*signoA*signoB;
        num1*=signoA;
        num2*=signoB;

        System.out.println("Calculado sumando"+num1+" " +num2+" "+resultado);
        scanner.close();

}   }


