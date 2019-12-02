package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Cambio de moneda
        Scanner sc = new Scanner(System.in);
        double numero;
        byte tipo;
        System.out.println("Seleccione una opción:");
        System.out.println("0. Convertir de Peseta a Euro");
        System.out.println("1. Convertir de Euro a Peseta");
        tipo = sc.nextByte();
        System.out.print("Indique el valor: ");
        numero = sc.nextDouble();
        if (tipo == 1) {
            numero = numero * 166.386;
            System.out.printf("%.0f", numero);
            System.out.println(" Pesetas");
        } else if (tipo == 0) {
            numero = numero / 166.386;
            System.out.printf("%.2f", numero);
            System.out.println(" Euros");
        } else {
            System.out.println("Error en tipo de moneda");
        }
    }
}
