package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Valor máximo, mínimo y media de una serie de 10 números
        Scanner sc = new Scanner(System.in);
        int numero, maximo, minimo, media, contador;
        media = 0;
        System.out.print("Introduzca número 1: ");
        numero = sc.nextInt();
        maximo = numero;
        minimo = numero;
        contador = 2;
        while(contador<=10)
        {
            System.out.print("Introduzca número "+ contador +": ");
            numero = sc.nextInt();
            if(numero>maximo) maximo = numero;
            if(numero<minimo) minimo = numero;
            media = media + numero;
            contador++;
        }
        System.out.println("El número Mayor es: " + maximo);
        System.out.println("El número Menor es: " + minimo);
        System.out.println("El media es: " + (media/10));
    }
}
