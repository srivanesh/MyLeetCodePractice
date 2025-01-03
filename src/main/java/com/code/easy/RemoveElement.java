package com.code.easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
       // int[] nums = {3, 2, 2, 3};
       // int val = 3;

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int valid_Size = 0;
        if(nums.length == 0) return  valid_Size;

        int j=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
                nums[valid_Size] = nums[i]; // If the current element is not we want to remove then move the current element to front of array
                valid_Size ++ ; // increment the array index
            }
        }
        return valid_Size;
    }
}
