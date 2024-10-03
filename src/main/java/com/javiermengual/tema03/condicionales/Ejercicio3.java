package com.javiermengual.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int edad;

        System.out.println("Dime tu edad");
        edad=Integer.parseInt(scanner.nextLine());

        if (edad>=18){
            System.out.println("Eres mayor de edad");
            System.out.println();
        } else {
            System.out.println("Eres menor de edad");

        }
    }




}
