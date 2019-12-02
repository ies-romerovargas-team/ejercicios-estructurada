package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Decidir si están ordenados o no tres números
        Scanner sc = new Scanner(System.in);
        int numX, numY, numZ;
        System.out.println("Introduzca tres números X, Y y Z para comprobar si están ordenados");
        System.out.print("Número X: ");
        numX = sc.nextInt();
        System.out.print("Número Y: ");
        numY = sc.nextInt();
        System.out.print("Número Z: ");
        numZ = sc.nextInt();

        if ((numX > numY) && (numY > numZ)) {
            System.out.println(numX + " > " + numY + " > " + numZ);
            System.out.println("Orden descendente de mayor a menor");
        } else if ((numX < numY) && (numY < numZ)) {
            System.out.println(numX + " < " + numY + " < " + numZ);
            System.out.println("Orden ascendente de menor a mayor");
        } else {
            System.out.println("Números desordenados");
        }
    }
}
