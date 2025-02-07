package com.code.easy;

public class Jumpgame2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums) {
        if (nums.length == 1) return 0; // No jumps needed if there's only one element

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            System.out.println("farthest: " + farthest+ " i: " + i+" currentEnd: "+currentEnd);
            if (i == currentEnd) {
                System.out.println("i: " + i+" currentEnd: "+currentEnd+" in if cond ");
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) break; // Early exit if we can reach the end
            }
        }

        return jumps;
    }
}
