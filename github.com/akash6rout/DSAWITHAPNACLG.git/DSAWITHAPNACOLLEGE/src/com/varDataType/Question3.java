package com.varDataType;

import java.util.Scanner;

public class Question3 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pencile");
        float pencile=sc.nextFloat();
        System.out.println("Enter Pen");
        float pen=sc.nextFloat();
        System.out.println("Enter eraser");
        float eraser=sc.nextFloat();

        
        float totalBill=pencile+pen+eraser;
        System.out.println("Total Bill is:::"+totalBill);

        
        float addgstbill=totalBill+(0.18f*totalBill);
        System.out.println("Adding gst with 18% tax"+addgstbill);
    }
}
