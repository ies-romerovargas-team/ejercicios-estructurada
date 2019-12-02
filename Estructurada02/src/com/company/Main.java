package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Determinar si un año es bisiesto (comprobar sólo si es múltiplo de 4)
        Scanner sc = new Scanner(System.in);
        int anno;
        System.out.print("Introduzca un año: ");
        anno = sc.nextInt();
        System.out.print("El año " + anno);
        if (anno % 4 != 0) {
            System.out.print("no");
        }
        System.out.print(" es bisiesto");
    }
}
