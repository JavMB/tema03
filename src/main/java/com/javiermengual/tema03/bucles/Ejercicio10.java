package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         float n1,n2, contador=0;
        Scanner sc=new Scanner(System.in);

       do {
           System.out.println("Dime un numero");
           n1=Float.parseFloat(sc.nextLine());
           contador+=n1;
       }while (n1!=0);

    }
}
