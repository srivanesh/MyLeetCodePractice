package Medium;

import java.util.Arrays;

public class ArrayProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(productExceptSelf(nums).toString());
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, left = 1; i < n; ++i) {
            ans[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1, right = 1; i >= 0; --i) {
            ans[i] *= right; // I made mistake here by using = instead of *=
            right *= nums[i];
        }
        Arrays.stream(ans).forEach(System.out::println);
        return ans;
    }
}
