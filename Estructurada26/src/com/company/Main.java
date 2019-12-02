package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Escribir los 10 primeros números pares o impares a elección del usuario
        Scanner sc = new Scanner(System.in);
        int i, numero;
        System.out.println("¿Quieres conocer los números Pares o Impares existentes entre 1 y 10?");
        System.out.println("1. Impares");
        System.out.println("2. Pares");
        numero = -1;
        while(numero==-1)
        {
            System.out.print("Introduzca opcion: ");
            numero = sc.nextInt();
            if((numero!=1)&&(numero!=2)) numero = -1;
        }
        for(i=numero;i<=10;i=i+2)
        {
            {
                System.out.println(i);
            }
        }
    }
}