package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // MCD dos números
        Scanner sc = new Scanner(System.in);
        int a, b, min, i;
        System.out.println("Introduzca dos números para hallar su MCD");
        System.out.print("Número 1º: ");
        a = sc.nextInt();
        System.out.print("Número 2º: ");
        b = sc.nextInt();
        if (a > b)
        {
            min = b;
        }
        else
        {
            min = a;
        }
        // otra forma de hallar el menor
        min = Math.min(a,b);
        // 'a' contiene el número menor, 'b' el mayor
        for (i = min; i >= 1; i--)
        {
            if ((a % i == 0) && (b % i == 0))
            {
                System.out.println("El MCD de " + a + " y " + b + " es " + i);
                i = 1;
            }
        }


        // Otra forma
        i = min;
        while (!(a % i == 0 && b % i == 0))
        {
            i--;
        }
        System.out.println("El MCD es " + i);
    }
}