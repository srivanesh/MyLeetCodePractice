package Medium;

import java.util.Arrays;

public class ArrayProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(productExceptSelf(nums).toString());
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] result = new int[nums.length];

        for(int i=0, temp =1; i<nums.length; i++){
            leftProduct[i] = temp;
            System.out.println("leftProduct: " + Arrays.toString(leftProduct));
            temp = temp * nums[i];
            System.out.println("temp: " + temp);
        }

        for(int i =nums.length-1, temp =1; i>= 0; i--){
            rightProduct[i] = temp;
            System.out.println("rightProduct: " + Arrays.toString(rightProduct));
            temp = temp * nums[i];
            System.out.println("temp: " + temp);
        }

        System.out.println("leftProduct: " + Arrays.toString(leftProduct));
        System.out.println("rightProduct: " + Arrays.toString(rightProduct));


        for(int i =0; i<nums.length; i++){
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }
}
