package com.code.easy;

import java.util.Arrays;
import java.util.HashMap;

public class IsoMorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    private static boolean isIsomorphic(String s, String t) {
        return helper(s).equals(helper(t));
    }

    private static String helper(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
           if(!map.containsKey(str.charAt(i))) {
               map.put(str.charAt(i), i);
           }
           sb.append(map.get(str.charAt(i)));
           sb.append(",");
        }
        return sb.toString();
    }
}
