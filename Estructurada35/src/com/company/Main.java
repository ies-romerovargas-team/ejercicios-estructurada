package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Notas Alumnos
        Scanner sc = new Scanner(System.in);
        boolean ok;
        float nota;
        ok = true;
        nota = 0;
        while (ok)
        {
            System.out.print("Introduzca una nota numérica [0-10]: ");
            nota = sc.nextFloat();
            if((nota>0) && (nota<10)) ok = false;
        }
        if(nota<5) System.out.println("SUSPENSO!! :(");
        if(nota>=5 && nota<6) System.out.println("SUFICIENTE :/");
        if(nota>=6 && nota<7) System.out.println("BIEN :|");
        if(nota>=7 && nota<9) System.out.println("NOTABLE :)");
        if(nota>=9) System.out.println("SOBRESALIENTE!! ;D");
    }
}
