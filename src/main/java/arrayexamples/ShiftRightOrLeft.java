package arrayexamples;

import java.util.Arrays;
/* To shift all zeros to the left in an array while maintaining space complexity of O(1), you can do it in place without using extra space other than a few variables. Here's how you can achieve this:

Approach:
Use two pointers:

One pointer (writeIndex) to keep track of the position where the next zero should be written.
Another pointer (i) to traverse the array.
Traverse the array from the right to the left:

When a zero is found, it is moved to the writeIndex position.
Non-zero elements are moved to the right as the zero is placed.
*/
public class ShiftRightOrLeft {
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 6, 0, 8, 0};
        
        // Initial position for placing zeros
        int writeIndex = arr.length - 1;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[writeIndex] = arr[i];
                writeIndex--;
            }
        }

        // Fill the remaining left part with zeros
        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }

        // Output the modified array
        System.out.println("shifted all o's to left"+Arrays.toString(arr)); // Output: [0, 0, 1, 6, 8]
        
        
        // shift all 1 to left
        int[] array= {1,4,6,7,1,8};
        
        int arrayIndex=array.length - 1;
        
        for(int i=array.length-1;i>=0;i--) {
        	if(array[i]!=1) {
        		array[arrayIndex]=array[i];
        		arrayIndex--;
        	}
        }
        
        while(arrayIndex>=0) {
        	array[arrayIndex]=1;
        	arrayIndex--;
        }
        
        System.out.println("shifted all 1's to left"+Arrays.toString(array));
        
        
     // shift all 1's to right
         
      // Initial position for placing zeros
        int[] arrayForInt= {1,1,4,5,1,5};
         int writeRightIndex = 0;
         
         for(int i=0;i<=arrayForInt.length - 1;i++) {
        	 if(arrayForInt[i]!=1) {
        		 arrayForInt[writeRightIndex]=arrayForInt[i];
        		 writeRightIndex++; 
        	 }         	
         }
         
         while (writeRightIndex<=arrayForInt.length-1) {
        	 arrayForInt[writeRightIndex]=1;
        	 writeRightIndex++;
		}
         
         System.out.println("shifted all 1's on right "+Arrays.toString(arrayForInt));
    }   
}

