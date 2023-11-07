package com.function;


public class AddDigit {
    public static void main(String[] args) {
        
        int num=88;
        int sumDigit=0;

        for(int i=1;i<=num;i++)
        {
            int lastDigit=num%10;
            sumDigit=sumDigit+lastDigit;
            num=num/10;
        }
        System.out.println(sumDigit);
    }
}
