package com.javiermengual.tema03.condicionales;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2,lado3;

        System.out.println("Dime el lado 1,2,3");
        lado1= scanner.nextInt();
        lado2= scanner.nextInt();
        lado3= scanner.nextInt();
        scanner.close();

        if (lado1==lado2&&lado1==lado3){
            System.out.println("Es equilatero");

        } else if (lado1==lado2||lado1==lado3||lado2==lado3) {

            System.out.println("Es isoceles");

        }else {
            System.out.println("Es escaleno");
        }
        scanner.close();


    }
}
