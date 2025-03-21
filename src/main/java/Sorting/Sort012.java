package Sorting;

public class Sort012 {

	public static void main(String[] args) {
		int sort[]= {1,0,2,2,1,1,0,0};
		sortIn1PAss(sort);
		System.out.println("srted array");
		for(int i:sort) {
			System.out.print( i);
		}
	}

	private static void sortIn1PAss(int[] sort) {
		int lo=0;
		int hi=sort.length-1;
		int mid=0;
		int temp;
		while(mid<hi) {
			switch(sort[mid]) {
			case 0:
				temp=sort[lo];
				sort[lo]=sort[mid];
				sort[mid]=temp;
				lo++;
				mid++;
				break;
			
			case 1:mid++;
				break;
				
			case 2:
				temp=sort[mid];
				sort[mid]=sort[hi];
				sort[hi]=temp;
				hi--;
				break;
			
			}
			
		}
		
	}

}
