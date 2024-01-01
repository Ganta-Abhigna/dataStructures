package com.example.dataStructures.arrays;

public class SubArrays {
    public static void main(String[] args)
    {
        int[] arr = { 1,2,3,4,5 };
        int N = arr.length;

        subArraysRecursive(arr, 0, 0);
        System.out.println("");
        subArraysIterative(arr,N);
    }
    public static void subArraysRecursive(int arr[], int start, int end){
        int n=arr.length;
        if(start==n){
            return;
        }
        if(end>=n){
            subArraysRecursive(arr, start+1,start+1);
        }
        else if(start<=end){
            eachSubArray(arr,start,end);
            subArraysRecursive(arr,start,end+1);
        }


    }
    public static void eachSubArray(int arr[], int start, int end){
        System.out.print("[");
        for(int i=start; i<end; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.print(arr[end]+"]");
    }
    public static void subArraysIterative(int arr[], int n) {
        int i=0,j=0;
        while(i<n){
            while(j<n){
                System.out.print("[");
                for(int k=i; k<j; k++){
                    System.out.print(arr[k]+ ", ");
                }
                System.out.print(arr[j]+"]");
                j++;
            }
            i++;
            j=i;
        }
    }
}
