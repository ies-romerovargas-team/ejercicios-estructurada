package com.company;

public class Main {

    public static void main(String[] args) {
        // Generador de números primos (2-1000)
        int a, i, cont;
        for (a = 2; a <= 1000; a++)
        {
            cont = 0;
            for (i = a; i >= 2; i--)
            {
                if (a % i == 0)
                {
                    cont++;
                }
            }
            if (cont == 1)
            {
                System.out.println(a);
            }
        }
    }
}