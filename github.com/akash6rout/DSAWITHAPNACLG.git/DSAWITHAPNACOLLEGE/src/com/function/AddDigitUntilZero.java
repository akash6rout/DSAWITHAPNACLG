package com.function;


public class AddDigitUntilZero {

    public static int digitSum(int num)
{
    for(int i=1;i<=num;i++)
    {
        int digitSum=0;
        while(num>0)
        {
            digitSum=digitSum+num%10;
            num=num/10;
        }
        num=digitSum;
    }
    return num;
}
    
    public static void main(String[] args) {
        int num=38;
        int result=digitSum(num);
        System.out.println(num);
        System.out.println(result);
    }

}
