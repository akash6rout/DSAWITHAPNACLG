package com.RecursionPart1;
public class SumOfNaturalNum {
    
    public static int printSumOfNaturalNum(int n){
        if(n==1){
            return 1;
        }
        int snm1=printSumOfNaturalNum(n-1);
        int sn=n+snm1;
        return sn; 
    }
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(printSumOfNaturalNum(n));
    }
}
