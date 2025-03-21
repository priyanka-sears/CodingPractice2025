package LeetCodes;

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 

You may assume that the majority element always exists in the array.
*/
public class MajorityElement {
	public static int majorityElement(int[] nums) {
		int count = 0;
		int element = 0;
		for (int i = 0; i <= nums.length - 1; i++) {

			if (count == 0) {
				element = nums[i];
				count++;
			} else if (element == nums[i]) {
				count++;
			} else {
				count--;
			}
		}

		return element;
		// int major=0;

		// for(int i=0;i<=nums.length-1;i++){
		// if(element == nums[i]){
		// major++;
		// }
		// }

		// if(major > nums.length/2){
		// return element;
		// }
		// return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 1 };
		int majorityElement = majorityElement(nums);
		System.out.println("majorityElement :" + majorityElement);
	}
}
