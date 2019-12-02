package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Cálculo del factorial de un numero
        Scanner sc = new Scanner(System.in);
        int numero;
        double factorial;
        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        factorial = 1;
        System.out.print("· Factorial de " + numero + "! => ");
        while(numero >= 1)
        {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
