package com.function;

public class BinaryToDecimal {

    public static void main(String[] args) {
        binToDec(101);
    }

    public static void binToDec(int binum) {
        int mynum=binum;
        int pow=0;
        int decnum=0;

        while(binum>0){
            int lastDigit=binum%10;
            decnum=decnum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binum=binum/10;
        }
        System.out.println("decimal of"+mynum+"="+decnum);
    }
}
