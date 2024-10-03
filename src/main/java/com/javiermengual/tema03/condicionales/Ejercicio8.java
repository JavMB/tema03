package com.javiermengual.tema03.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caraDado;


        System.out.println("Que cara ha salido?");
        caraDado=Integer.parseInt(scanner.nextLine());

        caraDado = switch (caraDado){
            case 1 -> 6;
            case 2 ->5;
            case 3->4;
            case 6->1;
            case 5->2;
            case 4->3;
            default -> 0;

            /*
            case 1,6 -> System.out.println(caraDado==1?1:6);

            case 2,5-> System.out.println(caraDado==2?2:5);

            case 3,4-> System.out.println(caraDado==3?3:4);

            default -> System.out.println("ERROR");

             */
        };
        System.out.println(caraDado);

    }
}
