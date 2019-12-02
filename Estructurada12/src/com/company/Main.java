package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Programa que escribe los números pares o impares del 1 al 10 a elección del usuario
        Scanner sc = new Scanner(System.in);
        int eleccion;
        System.out.println("Indique si quiere los números pares o impares");
        System.out.println("0. Impares");
        System.out.println("1. Pares");
        eleccion = sc.nextInt();
        if ((eleccion != 0) && (eleccion != 1)) {
            System.out.println("Elección incorrecta");
        } else {
            int contador;
            contador = 1;
            while (contador <= 10)
            {
                System.out.println(contador+eleccion);
                contador = contador +2;
            }
        }
    }
}