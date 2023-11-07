package com.RecursionPart1;
public class PrintFactor {

    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=printFact(n-1);
        int fn=n*printFact(n-1);
        return fn;
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println( printFact(n));
    }
}
