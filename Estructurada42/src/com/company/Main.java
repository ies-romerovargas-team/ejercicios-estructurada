package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Número Secreto
        Scanner sc = new Scanner(System.in);
        System.out.println(" :::::::::::::::::::::::::::::::::");
        System.out.println(" :: Juego  del  Número  Secreto ::");
        System.out.println(" :: ::::::::::::::::::::::::::: ::");
        System.out.println(" :: Adivine un nº entre 1 y 100 ::");
        System.out.println(" :: con ayuda de las pistas     ::");
        System.out.println(" :::::::::::::::::::::::::::::::::");
        Random r = new Random();
        int n, a, cont;
        n = r.nextInt(99) + 1; // entero entre 1 .. 100
        a = 0;
        cont = 0;
        while (a!=n){
            System.out.print("Introduzca su predicción: ");
            a = sc.nextInt();
            cont++;
            if(n>a){
                System.out.println("El número secreto es MAYOR");
            } else if (n<a){
                System.out.println("El número secreto es MENOR");
            }
        }
        System.out.println("Ha acertado al " + cont + "º intento!!");
    }
}