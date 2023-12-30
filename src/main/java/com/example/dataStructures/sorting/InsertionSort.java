package com.example.dataStructures.sorting;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        // 11,12,13,5,6
        int n= arr.length;
        insertionSort(arr, n);
        show(arr, n);
    }
    public static void insertionSort(int arr[], int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    public static void show(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
