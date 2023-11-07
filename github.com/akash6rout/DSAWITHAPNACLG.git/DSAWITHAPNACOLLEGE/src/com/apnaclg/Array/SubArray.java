package com.apnaclg.Array;


public class SubArray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};
        int n=arr.length;
        for(int sp=0;sp<n;sp++)
        {
            for(int ep=sp;ep<n;ep++)
            {
                for(int i=sp;i<=ep;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
