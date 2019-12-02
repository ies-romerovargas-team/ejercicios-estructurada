package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Valor máximo de 10 numeros
        Scanner sc = new Scanner(System.in);
        int numero, i, maximo;
        System.out.print("Introduzca n[1]: ");
        numero = sc.nextInt();
        maximo = numero;
        for(i=1;i<10;i++)
        {
            System.out.print("Introduzca n["+ (i+1) +"]: ");
            numero = sc.nextInt();
            if(numero>maximo) maximo = numero;
        }
        System.out.println("El número máximo es: "+ maximo);
    }
}
