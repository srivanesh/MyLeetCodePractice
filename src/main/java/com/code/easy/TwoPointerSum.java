package com.code.easy;

public class TwoPointerSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 10};
        int target = 10;

        int[] result = findPairWithSum(arr, target);
        if (result != null) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] findPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        System.out.println("right: " + right);
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[]{arr[left], arr[right]};  // Found the pair
            } else if (currentSum < target) {
                left++;  // Move left pointer to increase the sum
            } else {
                right--; // Move right pointer to decrease the sum
            }
        }

        return null;  // No pair found
    }
}
