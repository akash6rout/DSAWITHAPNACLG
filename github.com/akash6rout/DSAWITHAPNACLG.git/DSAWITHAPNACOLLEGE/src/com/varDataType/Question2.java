package com.varDataType;

import java.util.Scanner;

public class Question2 {
    /*
     * In a program, input the side of a square. You have to output the area of the
     * square.
     * (Hint : area of a square is (side x side
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();

        int area=side*side;

        System.out.println("Area of the square is"+area);

    }
}
