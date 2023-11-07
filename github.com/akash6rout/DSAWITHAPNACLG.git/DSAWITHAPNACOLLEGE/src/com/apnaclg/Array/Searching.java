package com.apnaclg.Array;


public class Searching {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int ans = 0;
        int target = 50;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
