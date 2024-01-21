package com.example.dataStructures.strings;

public class ZArray {
    public static void main(String[] args){
        String st = "geeks for geeks";
        String pat = "geek";
        findPatternZArray(st,pat);
    }
    public static void findPatternZArray(String st, String pat){
        String zString = pat+"$"+st;
        // A A B A $ A A B A A C  A  A  D  A  A B A A B A
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        int zArr[] = new int[zString.length()];
        int l=0,r=0;
        int n=zString.length();
        for(int i=1;i<zArr.length;i++){
            if (i>r){
                l=r=i;
                while(r<n && zString.charAt(r-l)==zString.charAt(r))
                    r++;
                zArr[i]=r-l;
                r--;
            }
            else{
                int k=i-l;
                if(zArr[k]<r-i+1)
                    zArr[i]=zArr[k];
                else {
                    l=i;
                    while(r<n && zString.charAt(r-l)==zString.charAt(r))
                        r++;
                    zArr[i]=r-l;
                    r--;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(zArr[i]>=pat.length())
                System.out.print(i-pat.length()-1+ " ");
        }
    }

}
