package com.javiermengual.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nota;

        System.out.println("Dime la nota");
        nota=Integer.parseInt(scanner.nextLine());

        switch (nota){
            case 0,1,2,3,4 -> System.out.println("INSUFICIENTE");

            case 5-> System.out.println("SUFICIENTE");

            case 6-> System.out.println("BIEN");

            case 7,8-> System.out.println("NOTABLE");

            case 9,10-> System.out.println("SOBRESALIENTE");

            default -> System.out.println("ERROR");





        }



    }
}
