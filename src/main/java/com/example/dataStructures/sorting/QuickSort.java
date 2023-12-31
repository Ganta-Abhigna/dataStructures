package com.example.dataStructures.sorting;

public class QuickSort {

   static void printArr(int arr[]){
       for(int i=0; i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }
   static void swap(int arr[], int i, int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }
   static int partition(int arr[], int left, int right){
       int pivot=arr[right];
       int i=left-1;
       for(int j=left;j<right;j++){
           if(arr[j]<pivot){
               i++;
               swap(arr,i,j);
           }
       }
       swap(arr,i+1,right);
       return i+1;
   }
   static void quickSort(int arr[], int left, int right){
       if(left<right){
           int p=partition(arr,left,right);
           quickSort(arr,left,p-1);
           quickSort(arr,p+1,right);
       }
   }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        //1,7,8,9,10,5
        //1,5,8,9,10,7
        //8,9,10,7 (2,5)
        //7,9,10,8
        //9,10,8(3,5)
        //10,9 (4,5)
        //9,10
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}
