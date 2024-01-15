package com.example.dataStructures.strings;

public class KMPAlgorithm {
    public static void main(String[] args){
        String st = "ABABDABACDABABCABAB";
        String pat = "BBA";
        findPattern(st,pat);
    }
    public static void findPattern(String st, String pat){
        int lps[]=computeLPS(pat);
        for(int i=0;i< lps.length;i++){
            System.out.print(lps[i]);
        }
        System.out.println("\n");
        int n=st.length();
        int m=pat.length();
        int j=0;
        int i=0;
        while(i<n){
            if(pat.charAt(j)==st.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println(i-j);
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j)!=st.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }
    public static int[] computeLPS(String pattern){
        //AAACAAAAAC
        char[] pat = pattern.toCharArray();
        int len=0;
        int[] lps = new int[pat.length];
        lps[0]=0;
        int i=1;
        while(i<pat.length){
            if(pat[i]==pat[len]){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }


}
