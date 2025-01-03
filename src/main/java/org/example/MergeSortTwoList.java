package org.example;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 =n-1, i=m+n-1;
        while( p2 >=0){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                // If nums1[p1] value is greater then set that in i and decrement i and nums1[]
                nums1[i--] =nums1[p1--];
            }else{
                nums1[i--] = nums2[p2--];
            }
        }

        System.out.println("Merged List :::"+ Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n );
    }
}