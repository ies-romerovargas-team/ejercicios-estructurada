package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {

    public static void main(String[] args) {
        // Factorial de un número
        Scanner sc = new Scanner(System.in);
        int numero, i, signo;
        double factorial;
        System.out.print("Introduzca número: ");
        numero = sc.nextInt();
        factorial = 1;
        for(i=numero; i>=1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial de " + numero + "! es: " + factorial);
    }
}
