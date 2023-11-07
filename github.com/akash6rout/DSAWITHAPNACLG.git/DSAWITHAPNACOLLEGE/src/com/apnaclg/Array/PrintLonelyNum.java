package com.apnaclg.Array;
import java.util.Arrays;

public class PrintLonelyNum {

    public static void printLonelyNumArray(int arr[],int n){
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i==0){
                if(arr[i+1]-arr[i]>1)
                {
                    System.out.println(arr[i]);
                }
            }
            else if(i==n-1){
                if(arr[i]-arr[i-1]>1)
                {
                    System.out.println(arr[i]);
                }
            }
            else{
                if(arr[i+1]-arr[i]>1 && arr[i]-arr[i-1]>1)
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={10,6,5,8,4,13};
        int n=arr.length;
        printLonelyNumArray(arr, n);

    }
}
