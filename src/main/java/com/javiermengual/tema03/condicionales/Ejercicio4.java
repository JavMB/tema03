package com.javiermengual.tema03.condicionales;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float num1,num2;

        System.out.println("Dime dos numeros");
        num1=Float.parseFloat(scanner.nextLine());
        num2=Float.parseFloat(scanner.nextLine());

        System.out.println(num1>num2 ? num1 : num2);
        System.out.println(num1<num2 ? num1 : num2);


    }
}
