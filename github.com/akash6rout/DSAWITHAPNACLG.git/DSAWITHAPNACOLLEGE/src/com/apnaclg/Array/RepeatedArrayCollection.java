package com.apnaclg.Array;
import java.util.HashMap;

public class RepeatedArrayCollection {

    public static void printRepeatedElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        System.out.println("Repeated elements:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " is repeated " + map.get(key) + " times");
            }
        }
}

    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1,3,3};
        printRepeatedElements(arr);
    }
}
