package com.code.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();
        for(char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0) + 1);
        }

        for (char c : t.toCharArray()) {
            if( countMap.containsKey(c)){
                countMap.put(c, countMap.get(c) - 1);
                if(countMap.get(c) == 0) countMap.remove(c);
            }
            else {
                return false;
            }
        }

        return countMap.isEmpty();
    }
}
