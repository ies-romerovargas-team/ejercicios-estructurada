package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Tabla de multiplicar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int mult, contador;
        mult = sc.nextInt();
        contador = 1;
        while (contador<=10)
        {
            System.out.println(mult + " x " + contador + " = " + mult*contador);
            contador++;
        }
    }
}
