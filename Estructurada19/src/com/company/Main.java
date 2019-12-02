package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Numeros de suspensos y aprobados
        Scanner sc = new Scanner(System.in);
        int nota, suspensos, contador;
        contador = 1;
        suspensos = 0;
        while (contador<=30)
        {
            System.out.print("Introduzca nota para alumno "+ contador +": ");
            nota = sc.nextInt();
            if(nota<5)
            {
                suspensos++;
            }
            contador++;
        }
        System.out.println("El número de aprobados es: " + (30-suspensos));
        System.out.println("El número de suspensos es: " + (suspensos));
    }
}
