package com.example.dataStructures.strings;

public class NaivePatternSearch {
    public static void main(String args[]){
        String str ="AABAACAADAABAABA";
        String search = "AABA";
        naiveApproach(str,search);
    }
    public static void naiveApproach(String str, String search){
        int n=str.length();
        int j=0;
        for(int i=0; i<n-search.length()+1;i++){
            if(str.substring(i,i+search.length()).equals(search)){
                System.out.println(i);
            }
        }
    }

}
