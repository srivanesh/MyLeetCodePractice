package com.code.easy;

public class SerchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsertAlg(nums, target));
    }

    private static int searchInsertAlg(int[] nums, int target) {

        int mid;
        int left = 0;
        int right = nums.length -1 ;
        while( left <= right){
            mid = left + (right-left)/2;
            if( nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}


