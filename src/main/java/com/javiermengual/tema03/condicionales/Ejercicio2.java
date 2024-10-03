package com.javiermengual.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2;

        System.out.println("Dime el primer numero");
            num1=Integer.parseInt(scanner.nextLine());
        System.out.println("Dime el segundo");
             num2=Integer.parseInt(scanner.nextLine());

             if (num1>num2){
                 System.out.println("Numero 1 es mayor que numero 2");
             }
                else if (num1<num2){
                    System.out.println("Numero 1 es menor que numero 2");
                }
                  else   if (num1==num2){
                        System.out.println("Son iguales");
                    }




    }
}
