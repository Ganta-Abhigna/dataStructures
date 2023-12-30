package com.example.dataStructures.sorting;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int n= arr.length;
        bubbleSort(arr, n);
        show(arr, n);
    }
    public static void bubbleSort(int arr[], int n){
         for(int i=0;i<n;i++){
             for(int j =0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
    }
    public static void show(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
