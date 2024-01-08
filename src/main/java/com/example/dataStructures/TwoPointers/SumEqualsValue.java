package com.example.dataStructures.TwoPointers;

public class SumEqualsValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7 };
        int val = 6;
        findSumEquals(arr, val);
    }

    private static void findSumEquals(int[] arr, int sum) {
        int i=0;
        int j= arr.length-1;
        while(j>i) {
            if (arr[i] + arr[j] == sum) {
                System.out.println(""+arr[i]+","+arr[j]);
                i++;
                j--;
            }
            else if (arr[i] + arr[j] < sum) {
                i++;
            }
            else{
                j--;
            }
        }

    }
}
