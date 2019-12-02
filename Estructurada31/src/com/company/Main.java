package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Número de suspensos y aprobados
        Scanner sc = new Scanner(System.in);
        int nota, i, suspenso;
        suspenso = 0;
        for(i=1;i<=30;i++)
        {
            System.out.print("Introduzca nota para alumno " + i + ": ");
            nota = sc.nextInt();
            if(nota<5) suspenso++;
        }
        System.out.println("El número de aprobados es: " + (30-suspenso));
        System.out.println("El número de suspensos es: " + (suspenso));
    }
}
