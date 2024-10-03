package com.javiermengual.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Dime el dinero");
        int centimos = (int)(scanner.nextDouble() * 100);

        int totalMonedas = 0;

        totalMonedas += centimos / 200;
        centimos %= 200;

        totalMonedas += centimos / 100;
        centimos %= 100;

        totalMonedas += centimos / 50;
        centimos %= 50;

        totalMonedas += centimos / 20;
        centimos %= 20;

        totalMonedas += centimos / 10;
        centimos %= 10;

        totalMonedas += centimos / 5;
        centimos %= 5;

        totalMonedas += centimos / 2;
        centimos %= 2;

        totalMonedas += centimos;

        System.out.println("El numero minimo de monedas necesarias es: " + totalMonedas);

        scanner.close();

    }







}
