package com.apnaclg.Array;
public class WaterCount {

    public static int findTotalWater(int[] arr, int n) {
        int lmax[] = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            lmax[i] = max;
        }
        int rmax[] = new int[n];

        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            rmax[i] = max;
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int lb = lmax[i];// step 1
            int rb = rmax[i];// step 2

            int min = Math.min(lb, rb); // step 3
            int ans = min - arr[i]; // step 4
            totalWater = totalWater + ans;
        }
        return totalWater;
    }

    public static void main(String[] args) {
        // int arr[]={3,0,2,0,4};
        int[] arr = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        System.out.println(findTotalWater(arr, n));
    }
}
