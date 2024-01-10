package com.example.dataStructures.arrays;

public class KadanesAlgorithm {
    public static void main(String[] args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findMaxSubArray(arr));
    }
    public static int findMaxSubArray(int[] arr){
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        int max_till_negative =0;
        for(int i=0;i<n;i++){
            max_till_negative=max_till_negative+arr[i];
            if(max<max_till_negative){
                max=max_till_negative;
            }
            if(max_till_negative<0){
                max_till_negative=0;
            }
        }
        return max;

    }
}
