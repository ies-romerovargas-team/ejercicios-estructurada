package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Detector de números primos
        Scanner sc = new Scanner(System.in);
        int a, i, cont;
        System.out.print("Introduzca un número para averiguar si es primo o no: ");
        a = sc.nextInt();
        cont = 0;
        for (i = a; i >= 2; i--)
        {
            if (a % i == 0) {
                cont++;
            }
        }
        System.out.print("El número " + a);
        if (cont == 1)
        {
            System.out.println(" es primo");
        } else {
            System.out.println(" NO es primo");
        }
    }
}
