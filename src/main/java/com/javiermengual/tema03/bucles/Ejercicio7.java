package com.javiermengual.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1,n2;
        float potencia=1;

        int signo1 = 1;
        int signo2 = 1;



        System.out.println("Dime los dos numeros"); //Pedimos numeros
        n1=Float.parseFloat(scanner.nextLine());
        n2=Float.parseFloat(scanner.nextLine());
        scanner.close();

        signo1=n1<0?-1:1;   //Guardamos los signos
        signo2=n2<0?-1:1;

        if (n1<0){  // transformamos los numeros a positivos para trabajar
            n1=-n1;
        }
        if (n2<0){
            n2=-n2;
        }


        for (int i = 1; i <= n2; i++) { //hacemos la potencia
                    potencia *= n1;
        }

        if(n2*signo2<0) {
                potencia=(1/potencia);
                System.out.println(potencia);
        }else {
                System.out.println(potencia*signo1*signo2); //ponemos los signos iniciales
        }






    }

}
