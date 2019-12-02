package com.company;

public class Main {

    public static void main(String[] args) {
	// 10 primeros numeros no multiplos ni de 2 ni de 3
        int n, i;
        n = 4;
        i=1;
        // Múltiplo de 2
        while(i<10)
        {
            if(n%2!=0)
            {
                // Múltiplo de 3
                if(n%3!=0)
                {
                    System.out.println(n);
                    i++;
                    n++;
                } else n++;
            } else n++;
        }
    }
}