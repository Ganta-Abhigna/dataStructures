package com.example.dataStructures.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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


    public static class Anagrams {
        public static void main(String[] args){
            String st[] = {"ct","abhi", "tac","god","dog","act","test"};
            printAnagramUsingHashMap(st);
        }
        public static void printAnagramUsingHashMap(String[] st){
            HashMap<String, List<String>> map=new HashMap<>();
            for(int i=0;i<st.length;i++){
                String word = st[i];
                char[] letters=word.toCharArray();
                Arrays.sort(letters);
                String newWord = new String(letters);
                if(map.containsKey(newWord)){
                    map.get(newWord).add(word);
                }
                else{
                    List<String> list = new ArrayList<>();
                    list.add(word);
                    map.put(newWord,list);
                }
            }
            for (List<String> list: map.values()) {
                if(list.size()>1)
                System.out.println(list);
            }
        }

    }
}
