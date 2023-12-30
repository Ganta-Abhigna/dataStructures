package com.example.dataStructures.sorting;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {64,25,12,22,11};
        int n= arr.length;
        selectionSort(arr, n);
        show(arr, n);
    }
    public static void selectionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int j;
            int min_index=i;
            for(j =i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void show(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
