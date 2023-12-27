package com.example.dataStructures.arrays;

public class BinarySearch {
    static int search(int arr[], int n, int k, int start, int end)
    {
        int mid=(start+end)/2;
        if (start>end){
            return -1;
        }
        if(arr[mid]==k){
                return mid;
        }
        else if(k<arr[mid]){
                return search(arr, n, k, start, mid-1);
        }
        else{
            return search(arr, n, k, mid+1, end);
        }

    }



    // Driver program to test above functions
    public static void main(String[] args)
    {
        BinarySearch rotate = new BinarySearch();
        int arr[] = { 5, 6, 7, 8, 9, 10};
        int n=arr.length;
        int k=11;
        int res = search(arr,n,k,0,n-1);
        if(res==-1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println(res);
        }

    }
}
