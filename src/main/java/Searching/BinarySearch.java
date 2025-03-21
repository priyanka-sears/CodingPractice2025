package Searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]) {
		
		int array[]= {1,4,8,9,5,78};
		int result=BinarySerch(array,4);
		if(result==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element present at position : "+result);
		}
	}

	private static int  BinarySerch(int[] array, int n) {
		Arrays.sort(array);
		int length=array.length-1;
		int l=0;
		int r=length;
		
		while(l<=r) {
			
			int middle=(l+r)/2;
			
			if(array[middle]==n) {
				return middle;
			}
			
			if(array[middle]>n) {
				r=middle-1;
			}
			if(array[middle]<n) {
				l=middle+1;
			}
			
		}
		
		return -1;
	}
}
