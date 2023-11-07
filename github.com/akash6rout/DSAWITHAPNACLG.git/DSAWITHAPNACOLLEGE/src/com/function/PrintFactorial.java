package com.function;

import java.util.Scanner;

public class PrintFactorial {
    
    public static void main(String[] args) {

        System.out.println(factorialNumber(4));

    }
    public static int factorialNumber(int number)
    {
        int f=1;
        for(int i=1;i<=number;i++)
        {
            f=f*i;
        }
        return f;
    }
}
