package com.code.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValidOne("()"));
    }

    private static boolean isValidOne(String s) {
        Deque<Character> stk = new ArrayDeque<>();
         for(char c : s.toCharArray()) {
                if(c == '(' || c == '{' || c == '[') {
                    stk.push(c);
                } else {
                    if (stk.isEmpty() || !match(stk.pop(), c)) {
                        return false;
                    }
                }
        }
     return stk.isEmpty();
    }

    private static boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}
