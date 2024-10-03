package com.javiermengual.tema03;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un año");
         year=Integer.parseInt(scanner.nextLine());

        boolean esBisiesto = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        System.out.println(esBisiesto);

        scanner.close();








    }
}
