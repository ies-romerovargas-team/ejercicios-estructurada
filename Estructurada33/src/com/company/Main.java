package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {

    public static void main(String[] args) {
	// calcular maximo, minimo y media de una serie de 10 numeros
        Scanner sc = new Scanner(System.in);
        int numero, i, maximo, minimo, media;
        System.out.print("Introduzca número n[1]: ");
        numero = sc.nextInt();
        maximo = numero;
        minimo = numero;
        media = 0;
        for(i=2;i<=10;i++)
        {
            System.out.print("Introduzca número n[" + i + "]: ");
            numero = sc.nextInt();
            if (numero>maximo) maximo = numero;
            if (numero<minimo) minimo = numero;
            media = media + numero;
        }
        System.out.println("Valor Máximo: " + maximo);
        System.out.println("Valor Mínimo: " + minimo);
        System.out.println("Valor Media: " + (media/10));
    }
}
