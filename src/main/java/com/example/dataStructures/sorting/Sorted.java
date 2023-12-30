package com.example.dataStructures.sorting;

public class Sorted {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int n= arr.length;
        boolean res=checksorted(arr, n);
        System.out.println(res);
    }
    public static boolean checksorted(int arr[], int n){
        if(n==1 || n==0){
            return true;
        }
        if(arr[n-1]<arr[n-2]){
            return false;
        }
        return checksorted(arr,n-1);
    }
}
