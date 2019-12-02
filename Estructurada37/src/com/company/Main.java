package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Opción de multiplos
        Scanner sc = new Scanner(System.in);
        String opc;
        int mult = 0, i;
        System.out.println("Elija opción:");
        System.out.println("a. Multiplos de 11 existentes entre 1 y 100");
        System.out.println("b. Multiplos de 17 existentes entre 1 y 100");
        System.out.println("c. Multiplos de 23 existentes entre 1 y 100");
        opc = sc.next();
        if (opc.equals("a")) {
            mult = 11;
        } else {
            if (opc.equals("b")) {
                mult = 17;
            } else {
                if (opc.equals("c")) {
                    mult = 23;
                }
            }
        }
        // método 1
        System.out.println("Opcion con bucle for");
        for (i = 1; i <= 100; i++) {
            if (i % mult == 0) {
                System.out.println(i);
            }
        }
        //método 2
        System.out.println("Opcion con bucle while");
        i = 1;
        while (mult * i <= 100) {
            System.out.println(mult * i);
            i++;
        }
    }
}
