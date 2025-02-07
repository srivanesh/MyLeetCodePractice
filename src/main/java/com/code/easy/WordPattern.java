package com.code.easy;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    private static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> char_ToWord =  new HashMap<>();
        HashMap<String, Character> word_ToChar =  new HashMap<>();
        String[] ws = s.split(" ");
        if(ws.length != pattern.length()) return false;

        for (int i = 0; i < ws.length; ++i) {
            char c = pattern.charAt(i);
            String w = ws[i];

            if (char_ToWord.containsKey(c) && !char_ToWord.get(c).equals(w)) {
                return false;
            }

            if (word_ToChar.containsKey(w) && word_ToChar.get(w) != c) {
                return false;
            }

            char_ToWord.put(c, w);
            word_ToChar.put(w, c);
        }

        return true;
    }
}
