package com.patterns;
public class PyramidNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(' ');
            }
            //pyramid line
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
                if(j!=i)
                {
                    System.out.print(' ');
                }
            }
            //blank space after pyramid line
            for(int j=1;j<=5-1;j++)
            {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
