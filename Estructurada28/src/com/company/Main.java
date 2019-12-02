package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escribir en orden ascedente o descendente todos los numeros entre A y B
        Scanner sc = new Scanner(System.in);
        int A, B, orden, i;
        System.out.print("Introduzca un número: ");
        A = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        B = sc.nextInt();
        orden = 1;
        if(A>B) orden = -1;
        for(i=(A+orden); i!=B; i=i+orden)
        {
            System.out.println(i);
        }

    }
}
