package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Numeros consecutivos entre dos dados
        Scanner sc = new Scanner(System.in);
        int num1, num2, orden;
        System.out.print("Introduzca un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca un número mayor o menor que " + num1 + ": ");
        num2 = sc.nextInt();
        orden = 1;
        if(num1>num2) orden = -1;
        System.out.println(num1);
        while(num1!=num2) {
            num1 = num1 + orden;
            System.out.println(num1);
        }
    }
}