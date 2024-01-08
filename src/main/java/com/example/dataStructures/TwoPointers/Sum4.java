package com.example.dataStructures.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        int arr[] = {1000000000,1000000000,1000000000,1000000000};
        int target =-294967296;

        System.out.println(isPairSum(arr,target));
    }

    private static List<List<Integer>> isPairSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList();
        int n= nums.length;
        for(int i=0;i<n-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<n-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1] ){
                    continue;
                }
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        sol.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return sol;
    }
}
