package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Numeros impares entre dos dados
        Scanner sc = new Scanner(System.in);
        int A, B, mayor, menor;
        System.out.print("Introduzca número A:");
        A = sc.nextInt();
        System.out.print("Introduzca número B:");
        B = sc.nextInt();
        if(A>B) {
            mayor = A;
            menor = B;
        } else {
            mayor = B;
            menor = A;
        }
        while(mayor>menor)
        {
            if(menor%2!=0){
                System.out.println(menor);
            }
            menor++;
        }
    }
}
