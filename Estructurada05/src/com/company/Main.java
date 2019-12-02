package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Números consecutivos
        Scanner sc = new Scanner(System.in);
        int numX, numY, numZ;
        System.out.println("Introduzca tres números X, Y y Z para comprobar si son consecutivos");
        System.out.print("Número X: ");
        numX = sc.nextInt();
        System.out.print("Número Y: ");
        numY = sc.nextInt();
        System.out.print("Número Z: ");
        numZ = sc.nextInt();
        System.out.println(numX + "  " + numY + "  " + numZ);
        if ((numX - numY == 1) && (numY - numZ == 1)) {
            System.out.println("Números consecutivos");
        } else if ((numY - numX == 1) && (numZ - numY == 1)) {
            System.out.println("Números consecutivos");
        } else {
            System.out.println("Números no consecutivos");
        }
    }
}
