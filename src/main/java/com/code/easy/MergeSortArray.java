package com.code.easy;

import java.util.Arrays;

public class MergeSortArray {

    public static void main(String[] args) {
        // Set 1
//        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
//        int m = 3, n =2;

        // Set 2
        //       int[] nums1 = {1}, nums2= {};
        //  int m = 1, n = 0;

        // Set 3
        int[] nums1 = {0}, nums2 = {1};
        int m = 0, n = 1;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2 and the merged array.
        int indexNums1 = m - 1; // Pointer for the last element in the nums1's original part
        int indexNums2 = n - 1; // Pointer for the last element in nums2
        int mergedIndex = m + n - 1; // Pointer for the last element of merged array (end of nums1)
        System.out.println("indexNums1: " + indexNums1 + " indexNums2: " + indexNums2 + " mergedIndex: " + mergedIndex);
        // Iterate over nums2 and nums1 from the end of both arrays
        while (indexNums2 >= 0) {
            // If nums1 is exhausted, or the current element in nums2 is larger
            if (indexNums1 < 0 || nums1[indexNums1] <= nums2[indexNums2]) {
                nums1[mergedIndex] = nums2[indexNums2]; // Place nums2's element in the merged array
                indexNums2--; // Move to the next element in nums2
            } else {
                // The current element in nums1 is larger; place it in the merged array
                nums1[mergedIndex] = nums1[indexNums1];
                indexNums1--; // Move to the next element in nums1
            }
            mergedIndex--; // Move to the next position in the merged array
        }
        // No need to check the remaining elements of nums1,
        // if any left, since they are already in their sorted position.
        System.out.println(Arrays.toString(nums1));
    }
}
