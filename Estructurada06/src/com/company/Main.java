package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Indicar el número de cifras
        Scanner sc = new Scanner(System.in);
        int num, suma;
        System.out.print("Introduzca un número entero (hasta 5 cifras): ");
        num = sc.nextInt();
        if (num < 0) {
            num = num * (-1);
        }
        suma = 0;
        while (num > 1) {
            suma++;
            num = num / 10;
        }
        System.out.println("Nº de cifras: " + suma);
    }
}