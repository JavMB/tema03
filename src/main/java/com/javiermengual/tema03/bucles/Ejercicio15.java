package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio15 {
    // Escribe un programa que solicite 3 números enteros h, m y s que contengan la hora, minutos y
    //segundos respectivamente, y compruebe si la hora que indican estos valores es un hora válida.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,m,s;
        System.out.println("Dime la hora, minutos y segundos| Escribelos sucesivamente");
        h=Integer.parseInt(sc.nextLine());
        m=Integer.parseInt(sc.nextLine());
        s=Integer.parseInt(sc.nextLine());

        if (h>24||m>59||s>59){
            System.out.println("Hora incorrecta");
        }else {
            System.out.println("Horra correcta");
        }



    //corregir




    }
}
