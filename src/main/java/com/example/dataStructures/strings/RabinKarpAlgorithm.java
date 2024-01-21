package com.example.dataStructures.strings;

public class RabinKarpAlgorithm {

    public static void findPattern(String st, String pat){
        int n=st.length();
        int m=pat.length();
        int decimal = 10;
        int s=0,p=0,multiplier=1,j;
        for(int i=0;i<m;i++){
            s=s*10+st.charAt(i);
            p=p*10+st.charAt(i);
        }
        for(int k=0;k<m-1;k++){
            multiplier=multiplier*1;
        }

        for(int i=0;i<=n-m;i++){
            if(s==p){
                for(j=0;j<m;j++){
                    if(pat.charAt(j)!=st.charAt(j+i)){
                        break;
                    }
                }
                if(j==m){
                    System.out.println("index at "+i);
                }

            }
            else{
                s=decimal*(s-multiplier*decimal)+st.charAt(i);
            }
        }
    }
    public static void main(String[] args){
        String st = "AABAACAADAABAABA";
        String pat = "AABA";
        findPattern(st,pat);
    }
}
