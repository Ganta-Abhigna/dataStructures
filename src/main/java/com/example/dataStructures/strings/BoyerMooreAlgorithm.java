package com.example.dataStructures.strings;

public class BoyerMooreAlgorithm {
    public static void main(String[] args){
        String st = "GCAATGCCTATGTGACC";
        String pat = "TATGTG";
        findPattern(st,pat);
    }
    public static void findPattern(String st, String pat){
        int[] alphaCount = preprocess(pat);
        int n = st.length();
        int m = pat.length();
        int shift=0;
        while(shift<n-m){
            int j = m-1;
            while(j>=0 && st.charAt(shift+j)==pat.charAt(j)){
                j--;
            }
            if(j<1){
                System.out.println(shift);
                shift+=(shift+m<n)? m-alphaCount[(int) st.charAt(shift+m)]:1;
            }
            else{
                shift+=Integer.max(1,j-alphaCount[(int) st.charAt(shift+j)]);
            }
        }

    }
    public static int[] preprocess(String pat){
        int[] alphaCount = new int[256];
        for(int i=0;i<pat.length();i++){
            alphaCount[(int)pat.charAt(i)] = i;
        }
        return alphaCount;
    }
}
