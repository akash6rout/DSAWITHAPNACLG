package com.RecursionPart1;
public class LstOccurance {

    public static int lastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr, key, i+1);
            if(isFound==-1 && arr[i]==key){
                return i;
            }
        return isFound;
    }
    
    public static void main(String[] args) {
        
        int arr[]={5,5,5,5};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
