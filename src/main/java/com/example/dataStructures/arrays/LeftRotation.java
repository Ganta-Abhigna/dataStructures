package com.example.dataStructures.arrays;

public class LeftRotation {
    public static void main(String[] args){
        int arr[] ={1, 2, 3, 4, 5, 6, 7};
        int n=arr.length;
        int k=9;
        if(k>n){
            k= k % n;
        }
        leftRotate(arr,n,k);
    }
    public static void leftRotate(int arr[], int n, int k){
        int newArr[] = new int[n];
        for(int i=0; i<n-k;i++){
            newArr[i]=arr[i+k];
        }
        int index=0;
        for(int i=n-k;i<n;i++){
            newArr[i]=arr[index];
            index++;
        }
        for(int i=0;i<n;i++){
            System.out.println(newArr[i]);
        }

    }
}
