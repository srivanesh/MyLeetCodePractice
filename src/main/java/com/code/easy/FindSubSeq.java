package com.code.easy;

public class FindSubSeq {
    public static void main(String[] args) {
        String s  = "abc";
        String t = "ahbgdc";
        System.out.println(findSeq(s, t));
    }

    private static boolean findSeq(String s, String t) {
        int i =0, j=0;
        int m = s.length(), n = t.length();

        while( i < m && j < n) {
            System.out.println("i: " + i + " j: " + j);
            if(s.charAt(i) == t.charAt(j)){
                ++i;
                System.out.println(" Match i: " + i + " j: " + j);
            }
            ++j;
            System.out.println(" Outside Match i: " + i + " j: " + j);
        }
        return i == m;
    }
}

