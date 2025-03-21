package arrayexamples;

// array can have max 2 duplicate in array

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int i = 2; // Start placing valid elements from index 2
        
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {  // Check if the current element is valid
                nums[i] = nums[j];         // Place the element at index i
                i++;                       // Move the pointer i forward
            }
        }
        
        return i; // i is the length of the modified array
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);
        
        System.out.println("Length of modified array: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
