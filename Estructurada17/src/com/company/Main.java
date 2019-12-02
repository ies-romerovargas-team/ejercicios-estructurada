package com.company;

public class Main {

    public static void main(String[] args) {
	// suma números pares entre 1 y 1000
        int contador, suma;
        contador = 0;
        suma = 0;
        while(contador<1000)
        {
            contador = contador + 2;
            suma = suma + contador;
        }
        System.out.println("Suma: " + suma);
    }
}
