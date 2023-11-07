package com.RecursionPart1;
public class PrintDecreasingNum {

    public static void printDec(int n)
    {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    
    public static void main(String[] args) {
        
        int n=10;
        printDec(n);
    }
}
