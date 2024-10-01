package com.javiermengual.tema03;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Dime un numero");
        int num=Integer.parseInt(scanner.nextLine());

        if (num%2==0){
            System.out.println("El numero es par");
        }   else {
            System.out.println("El numero es impar");

        }




    }
}
