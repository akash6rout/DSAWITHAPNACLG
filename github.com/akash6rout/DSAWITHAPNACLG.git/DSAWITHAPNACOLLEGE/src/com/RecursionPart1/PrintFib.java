package com.RecursionPart1;
public class PrintFib {
    
    public static int printFib(int n){
        if(n==0||n==1)
        {
            return n;
        }
        int fib1=printFib(n-1);
        int fib2=printFib(n-2);
        int fn=fib1+fib2;
        return fn;
    }
    public static void main(String[] args) {
        
        int n=25;
        System.out.println(printFib(n));
    }
}
