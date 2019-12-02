package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Valor máximo de una serie de 10 números
        Scanner sc = new Scanner(System.in);
        int numero, mayor, contador;
        numero = 0;
        contador = 1;
        mayor = 0;
        while(contador<=10)
        {
            System.out.print("Introduzca número "+ contador +": ");
            numero = sc.nextInt();
            if(numero>mayor) mayor = numero;
            contador++;
        }
        System.out.print("El número Mayor es: " + mayor);
    }
}
