package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int tabla;
        System.out.println("Dime que tabla");
        Scanner scanner = new Scanner(System.in);

        tabla=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=10 ; i++) {
            System.out.println(tabla+" * "+i+" "+tabla*i);

        }



    }
}
