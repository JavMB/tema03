package com.javiermengual.tema03.bucles;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*Escribe un programa que permita jugar al siguiente juego. Se dispone de un dado normal de 6
caras con valores comprendidos entre 1 y 6. El objetivo del juego es sumar más puntos que el rival
(en este caso el ordenador) sin pasarse de 11 puntos (similitudes con el blackjack). Empezará el
jugador, que lanzará los dados hasta que ocurra alguno de los siguientes acontecimientos:

a) Obtenga exactamente 11 puntos (ha ganado).
b) Decida plantarse con una puntuación inferior a 11 puntos.
c) Se haya pasado de 11 puntos y por tanto habrá perdido.

En el caso a) sumará automáticamente dos porras (1 porra por victoria y otra de bonificación por
alcanzar la puntuación máxima).
En el caso b) el ordenador jugará e intentará igualar o superar sin pasarse de 11 puntos la
puntuación del jugador. Si consigue igualar o superar la puntuación sumará una porra para el
ordenador. Si además lo hace con una puntuación de 11 puntos tendrá bonificación de otra porra
por alcanzar la puntuación máxima.
En el caso c) el ordenador gana automáticamente y suma una porra sin necesidad de jugar.
El primero que llegue a 5 porras gana la partida*/

        int playerPorra = 0, cpuPorra = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int lanzar;
        int tirada;

        do {

            int puntosPlayer = 0;
            do {
                System.out.println("\nLanzar dado si: 1 no: 0");
                lanzar = Integer.parseInt(sc.nextLine());

                if (lanzar == 1) {
                    tirada = rand.nextInt(1, 7);
                    puntosPlayer += tirada;
                    System.out.println("Ha salido un " + tirada + " tienes " + puntosPlayer + " puntos");

                } else {
                    break;
                }
            } while (puntosPlayer < 11);


            if (puntosPlayer <= 11) {
                tirada = rand.nextInt(1, 7);

                if (puntosPlayer == 11) {
                    playerPorra += 2;
                    System.out.println("PORRA PARA EL PLAYER +2");
                } else if (tirada == 11) {
                    cpuPorra += 2;
                    System.out.println("PORRA PARA LA CPU +2 LA CPU SACO UN 11!!!");
                } else if (puntosPlayer < tirada) {
                    cpuPorra++;
                    System.out.println("PORRA PARA LA CPU +1 LA CPU SACO UN : "+tirada);
                } else if (puntosPlayer > tirada) {
                    playerPorra++;
                    System.out.println("PORRA PARA EL PLAYER +1");
                }
            } else {
                cpuPorra++;
                System.out.println("PORRA PARA LA CPU +1");
            }
            System.out.println("cpu: "+cpuPorra+" player: "+playerPorra);
        }while (playerPorra<5&&cpuPorra<5);

        System.out.println(cpuPorra >= 5 ? "CPU gana!" : playerPorra >= 5 ? "Player gana!" : "Aún no hay ganador");
    }
}
