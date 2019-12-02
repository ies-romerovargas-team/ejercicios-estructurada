package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int mayor, menor, mediano;
        System.out.println(":: Número mayor, mediano y menor ::");
        System.out.print("Introduzca un Número [a]: ");
        a = sc.nextInt();
        System.out.print("Introduzca un Número [b]: ");
        b = sc.nextInt();
        System.out.print("Introduzca un Número [c]: ");
        c = sc.nextInt();

        mayor = a;
        if (b>mayor) mayor = b;
        if (c>mayor) mayor = c;

        menor = a;
        if (b<menor) menor = b;
        if(c<menor) menor = c;

        mediano = a;
        if ((b!=mayor) && (b!=menor)) mediano = b;
        if ((c!=mayor) && (c!=menor)) mediano = c;

        System.out.println("Nº mayor : " + mayor);
        System.out.println("Nº mediano : " + mediano);
        System.out.println("Nº menor : " + menor);
    }
}
