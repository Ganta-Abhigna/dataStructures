package com.example.dataStructures.sorting;

public class MergeSort {
    public static void main(String[] args){
        int arr[] = {64,25,12,22,11};
        int n= arr.length;
        sort(arr,0, n-1);
        show(arr, n);
    }
    public static void sort(int arr[], int l, int r){
        if(l<r){
            int mid=l+(r-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[], int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int left[] = new int[n1];
        int right[]= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[m+j+1];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
    }
    public static void show(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
