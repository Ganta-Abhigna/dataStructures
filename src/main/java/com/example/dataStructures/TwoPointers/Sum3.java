package com.example.dataStructures.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int arr[] = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2};

        System.out.println(isPairSum(arr));
    }

    private static List<List<Integer>> isPairSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList();
        int n= nums.length;
        for(int i=0;i<n-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
                int k=i+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[k]+nums[l];
                    if(sum==0){
                        sol.add(Arrays.asList(nums[i],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    else if(sum<0){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        return sol;
    }
}
