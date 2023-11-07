package com.Loop;

import java.util.Scanner;

public class Multipliation {

    public static void printMultiplicationTable()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
    
    public static void main(String[] args) {
        
        printMultiplicationTable();
    }
}
