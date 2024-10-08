package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero");
        int num = Integer.parseInt(scanner.nextLine());
        int factorial=1;

        for (int i = 1; i <=num ; i++) {
            System.out.println(i);
            factorial*=i;

        }
        System.out.println("\n"+factorial);
    }
}
