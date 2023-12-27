package com.example.dataStructures.arrays;

public class RightRotate {
    public static void main(String[] args){
        int arr[] ={1, 3, 5, 7, 9};
        int n=arr.length;
        int k=2;
        if(k>n){
            k= k % n;
        }
        rightRotate(arr,n,k);
    }
    public static void rightRotate(int arr[], int n, int k){
        int newArr[] = new int[n];
        for(int i=0; i<k;i++){
            newArr[i]=arr[n-k+i];
        }
        int index=0;
        for(int i=k;i<n;i++){
            newArr[i]=arr[index];
            index++;
        }
        for(int i=0;i<n;i++){
            System.out.println(newArr[i]);
        }

    }
}
