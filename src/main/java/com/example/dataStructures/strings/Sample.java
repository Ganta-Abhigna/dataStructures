package com.example.dataStructures.strings;

import java.util.Stack;

public class Sample {
    public static void main(String args[]){
        String s = "abcde";
//        char[] st = reverseTwoPointers(s.toCharArray());
//        for(int i=0;i<st.length;i++){
//            System.out.println(st[i]);
//        }
//        System.out.println("************");
//        char[] string = s.toCharArray();
//        reverseRecursion(string,0);
//        for(int i=0;i<string.length;i++){
//            System.out.println(string[i]);
//        }
//        System.out.println("************");
//        int d=2;
//        leftRotate(s,d);
//        System.out.println("************");
//        rightRotate(s,d);
//        sort("geeksforgeeks");
//        System.out.println("****************");
//        int b=5;
//        int c=2;
//        char[] arr=swapCharacters(s.toCharArray(),b,c);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("**************");
        int b=5;
        int c=2;

        String st = swapCharactersOptimum(s,b,c);
        System.out.println(st);

    }
    public static char[] reverse(char[] st){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i< st.length;i++){
            stack.push(st[i]);
        }
        for(int i=0;i< st.length;i++){
            st[i] = stack.pop();
        }
        return st;

    }
    public static char[] reverseTwoPointers(char[] st){
        int i=0;
        int j=st.length-1;
        while(i<j){
            char temp=st[i];
            st[i]=st[j];
            st[j]=temp;
            i++;
            j--;
        }
        return st;

    }
    public static void reverseRecursion(char[] st, int i){
        if(i==st.length/2){
            return;
        }
        char temp=st[i];
        st[i]=st[st.length-i-1];
        st[st.length-i-1] = temp;
        reverseRecursion(st, i + 1);

    }
    public static String leftRotate(String st,int d){
        st= st.substring(d)+st.substring(0,d);
        return st;
    }
    public static String rightRotate(String st,int d){
        st= st.substring(st.length()-d)+st.substring(0,st.length()-d);
       return st;
    }
    public static void sort(String st){
        int[] arr = new int[26];
        for(char c: st.toCharArray()){
            arr[c - 'a']++;
        }
        for(int i=0;i<26;i++){

            if(arr[i]>0){
                System.out.print((char)(i+'a'));
                System.out.print(arr[i]);
            }

        }
    }
    public static char[] swapCharacters(char arr[], int b, int c){
        int n=arr.length;
        //abcde
        //5
        //2
        //cbade
        //cdabe
        //cdeba
        //bdeca
        //ba ecd
        //eabcd
        //ecbad
        //ecdab
        c=c%n;
        for(int i=0;i<b;i++){
            char temp= arr[i];
            arr[i]=arr[(i+c)%n];
            arr[(i+c)%n]=temp;
        }
        return arr;
    }
    public static String swapCharactersOptimum(String s, int b, int c){
        int n=s.length();
        c=c%n;

        int f = b/n;
        int x = b%n;

        String b1 = leftRotate(s.substring(0,c),((n%c)*f)%c);
        String b2 = leftRotate(s.substring(c),(c*f)%(n-c));

        char[] arr= (b1+b2).toCharArray();
        for(int i=0;i<x;i++){
            char temp= arr[i];
            arr[i]=arr[(i+c)%n];
            arr[(i+c)%n]=temp;
        }
        return new String(arr);
    }
}
