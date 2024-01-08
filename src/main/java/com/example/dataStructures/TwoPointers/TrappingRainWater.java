package com.example.dataStructures.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args){
        int arr[] = {1,0,2,1,0,1,2,1,2,1};
        int sol = trappingRainWater(arr);
        System.out.println(sol);
    }
    public static int trappingRainWater(int[] arr){
        int n = arr.length;
        int res=0;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        leftArr[0] = arr[0];
        rightArr[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            leftArr[i] = Math.max(leftArr[i-1],arr[i]);
        }
        for(int j=n-2; j>=0; j--){
            rightArr[j] = Math.max(rightArr[j+1],arr[j]);
        }
        for(int k=0;k<n;k++){
            res= res+Math.min(leftArr[k],rightArr[k])-arr[k];
        }
        return res;
    }




}
