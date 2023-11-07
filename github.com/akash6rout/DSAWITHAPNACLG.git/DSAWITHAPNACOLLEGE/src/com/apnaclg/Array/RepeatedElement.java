package com.apnaclg.Array;
public class RepeatedElement {

    public static void printRepeatedElements(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.println("Repeated elements:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " is repeated " + count + " times");
            }
            visited[i] = true;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,1,};
        printRepeatedElements(arr);
    }
}
