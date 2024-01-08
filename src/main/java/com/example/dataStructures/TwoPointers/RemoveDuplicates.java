package com.example.dataStructures.TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args){
        int arr[] = {0,0,1,1,2,3,4,4};
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int[] arr){
        int n = arr.length;
        int j=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }
        }
        for(int i=0; i<j;i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
