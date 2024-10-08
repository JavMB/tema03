package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n1;
        int suma=0;
        int contador=0;

        do {
            System.out.println("Dime un numero");
            n1=Float.parseFloat(sc.nextLine());
            suma+=n1;
            contador++;

        }while (n1>0);


        System.out.println(suma/contador);

        //Calcular media


    }
}
