package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Calcular la resta de dos números (mayor-menor)
        Scanner sc = new Scanner(System.in);
        int a, b, resta;
        System.out.print("Introduzca número 1 (entero): ");
        a = sc.nextInt();
        System.out.print("Introduzca número 2 (entero): ");
        b = sc.nextInt();
        resta = a - b;
        if (resta < 0) {
            resta = resta * (-1);
        }
        System.out.println("El resultado es: " + resta);
    }
}