package com.javiermengual.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int intentos;
        int contadorintentos = 0;
        int numeroAleatorio = rand.nextInt(101);
        int numeroUsuario;

        System.out.println("Dime cuantos intentos");
        intentos = Integer.parseInt(sc.nextLine());

        do {
            System.out.println("Dime el numero");
            numeroUsuario = Integer.parseInt(sc.nextLine());

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("HAS GANADO");
                break;
            } else {
                System.out.println(numeroUsuario < numeroAleatorio ? "es mas alto" : "es mas bajo");
                contadorintentos++;

            }

        } while (contadorintentos < intentos);

        if (numeroUsuario != numeroAleatorio) {
            System.out.println("HAS PERDIDO");
        }
    }
}
