package arrayexamples;

import java.util.Arrays;

/***
Explanation:
k = k % n: Handles cases where k is larger than the length of the array, similar to the right rotation case.
reverse(nums, 0, k - 1): Reverses the first k elements.
reverse(nums, k, n - 1): Reverses the remaining elements from k to the end of the array.
reverse(nums, 0, n - 1): Finally, reverse the entire array to achieve the left rotation. * */
public class RotateArrayToLeft {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // If k is larger than the length of the array, take the modulus
        System.out.println("value of k : "+k);
        reverse(nums, 0, k - 1);  
        reverse(nums, k, n - 1);  
        reverse(nums, 0, n - 1);  
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
