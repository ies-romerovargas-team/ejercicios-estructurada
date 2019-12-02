package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// valor medio de unos números introducidos por el usuario hasta que encuentra negativo
        Scanner sc = new Scanner(System.in);
        int suma, numero, contador;
        numero = 0;
        contador = 0;
        suma = 0;
        while(numero>=0)
        {
            suma = suma + numero;
            contador++;
            System.out.print("Introduzca número " + contador + ": ");
            numero = sc.nextInt();
        }
        System.out.print("La media es: " + suma/(contador-1));
    }
}
