package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // mcm dos números
        Scanner sc = new Scanner(System.in);
        int a, b, i, max, tope;
        System.out.println("Introduzca dos números para hallar su mcm");
        System.out.print("Número 1º: ");
        a = sc.nextInt();
        System.out.print("Número 2º: ");
        b = sc.nextInt();
        if (a > b)
        {
            max = a;
        } else
        {
            max = b;
        }
        max = Math.max(a,b);
        tope = a * b; // mínimo común múltiplo, final del bucle
        for (i = max; i <= tope; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                System.out.println("El mcm de " + a + " y " + b + " es " + i);
                i = tope;
            }
        }
        // otra forma
        i = max;
        while (!(i % a == 0 && i % b == 0))
        {
            i++;
        }
        System.out.println("El mcm de " + a + " y " + b + " es " + i);
    }
}