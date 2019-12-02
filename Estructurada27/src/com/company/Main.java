package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Tabla de multiplicar
        Scanner sc = new Scanner(System.in);
        int numero, i;
        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
