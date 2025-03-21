package arrayexamples;

import java.util.Arrays;

/***
 * */
public class RotateArrayTORight {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // If k is larger than the length of the array, take the modulus
        reverse(nums, 0, n - 1);  // Step 1: Reverse the whole array
        reverse(nums, 0, k - 1);  // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1);  // Step 3: Reverse the rest of the array
    }

    // Helper function to reverse the elements in an array between two indices
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rotate(nums, k);
        
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
