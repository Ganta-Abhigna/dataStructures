package com.example.dataStructures.arrays;

public class InsertSorted {
    public static void main(String args[]){
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 50;
        arr[3] = 70;
        arr[4] = 90;
        int n=5;
        int k = 100;
        insertElement(arr,n,k);
        printArray(arr,n);
    }
    static void insertElement(int arr[], int n, int k){
        int i;
        for(i=n-1;i>=0 && arr[i]>k; i--){
            arr[i+1]=arr[i];
        }
        arr[i+1]=k;
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}
