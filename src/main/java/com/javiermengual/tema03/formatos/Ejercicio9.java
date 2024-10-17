package com.javiermengual.tema03.formatos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ciudad ;
        String fecha;
        int dia, mes, year;
        String horaMedida;
        int hora,minutos,segundos;
        int velocidadViento;
        float temperatura;
        float presion;
        int probLluvia;
        int uvi;

        System.out.println("Dime tu ciudad");
        ciudad=sc.nextLine();

        System.out.println("Dime la fecha: 1.dia 2.mes 3.anyo");
        dia= Integer.parseInt(sc.nextLine());
        mes= Integer.parseInt(sc.nextLine());
        year= Integer.parseInt(sc.nextLine());


        System.out.println("Dime la fecha: 1.hora 2.minutos 3.segundos");
        hora= Integer.parseInt(sc.nextLine());
        minutos= Integer.parseInt(sc.nextLine());
        segundos= Integer.parseInt(sc.nextLine());

        System.out.println("Dime la velocidad del viento");
        velocidadViento=Integer.parseInt(sc.nextLine());

        System.out.println("Dime la temperatura");
        temperatura=Float.parseFloat(sc.nextLine());

        System.out.println("Dime la presion atmosferica");
        presion=Float.parseFloat(sc.nextLine());

        System.out.println("Dime la probabilidad de lluvia");
        probLluvia=Integer.parseInt(sc.nextLine());

        System.out.println("Dime el UV");
        uvi=Integer.parseInt(sc.nextLine());



        System.out.printf("%-50s%n", "**DATOS ESTACIÓN METEOROLOGICA**");
        System.out.printf("%-24s%s%n", "Ciudad: ", ciudad);
        System.out.printf("%-24s%02d/%02d/%04d%n", "Fecha: ", dia, mes, year);
        System.out.printf("%-24s%02d:%02d:%02d%n", "Hora de la mesura: ", hora, minutos, segundos);
        System.out.printf("%-24s%d km/h%n", "Velocidad viento: ", velocidadViento);
        System.out.printf("%-24s%.2f C%n", "Temperatura: ", temperatura);
        System.out.printf("%-24s%.1f hPa%n", "Presion: ", presion);
        System.out.printf("%-24s%d%%%n", "Prob lluvia: ", probLluvia);
        System.out.printf("%-24s%d%n", "UVI: ", uvi);






    }
}

