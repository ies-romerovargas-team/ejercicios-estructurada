package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Numeros que hay entre dos dados
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Escriba un número: ");
        num1 = sc.nextInt();
        num2 = num1;
        while (num2<=num1)
        {
            System.out.print("Escriba un número mayor que " + num1 + ": ");
            num2 = sc.nextInt();
        }
        while (num1<=num2)
        {
            System.out.println(num1);
            num1++;
        }
    }
}
