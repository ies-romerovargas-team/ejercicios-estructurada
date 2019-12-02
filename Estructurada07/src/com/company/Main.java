package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ecuación de segundo grado
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2;
        System.out.println("Ecuación de 2º Grado: ax\u00B2 + bx + c = 0");
        System.out.print("Coeficiente a: ");
        a = sc.nextInt();
        System.out.print("Coeficiente b: ");
        b = sc.nextInt();
        System.out.print("Coeficiente c: ");
        c = sc.nextInt();
        System.out.println(a + "x\u00B2 + " + b + "x + " + c + " = 0");
        x1 = ((b * (-1)) + Math.sqrt((b*b)- 4*a*c))/(2*a);
        x2 = ((b * (-1)) - Math.sqrt((b*b)- 4*a*c))/(2*a);
        System.out.println("x\u2081 = " + x1);
        System.out.println("x\u2082 = " + x2);
    }
}