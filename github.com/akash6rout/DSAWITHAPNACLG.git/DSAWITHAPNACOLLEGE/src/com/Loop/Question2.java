package com.Loop;

import java.util.Scanner;

public class Question2 {
    /*Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers. */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter The Number");
            number=sc.nextInt();

            if(number%2==0)
            {
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.println("If you want to continue Press 1 and for no 0");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of the evennum"+evenSum);
        System.out.println("Sum of the oddnum"+oddSum);
    }
}
