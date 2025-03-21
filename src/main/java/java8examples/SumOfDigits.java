package java8examples;

import java.util.stream.IntStream;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=12345;
		
		IntStream intStream=String.valueOf(number).chars();
		
	int sum=	intStream.map(Character::getNumericValue).sum();
	
	System.out.println(sum);
	
	// optimized code
	
	System.out.println(String.valueOf(number).chars().map(Character::getNumericValue).sum());

	}

}
