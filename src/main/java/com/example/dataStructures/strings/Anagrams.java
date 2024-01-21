package com.example.dataStructures.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
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
