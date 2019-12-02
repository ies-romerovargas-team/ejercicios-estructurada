package com.company;

public class Main {

    public static void main(String[] args) {
	// Programa que escribe los números impares del 1 al 10
        int contador;
        contador = 1;
        while (contador<=10)
        {
            if(contador%2!=0)
            {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
