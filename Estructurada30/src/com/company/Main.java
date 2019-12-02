package com.company;

public class Main {

    public static void main(String[] args) {
	// Suma de todos los números pares entre 1 y 1000
        int i, suma;
        suma = 0;
        for(i=2;i<=1000;i=i+2)
        {
            suma = suma + i;
        }
        System.out.println("Suman: "+ suma);
    }
}
