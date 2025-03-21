package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSquaresOfEvens {

	public static void main(String argsv[]) {
		List<Integer> numberlist = Arrays.asList(1, 2, 3, 4, 5, 6);

		// reduce(0, Integer::sum): Accumulates the sum of the squared numbers. The 0 is the initial value of the sum.
		int sum = numberlist.stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.reduce(0, Integer::sum);
		
		

		System.out.println("Sum of squares of even numbers: " + sum);
		
		
		int sumOfSquares = IntStream.rangeClosed(1, 10)  // Range from 1 to 10
	            .filter(n -> n % 2 == 0)                   // Filter even numbers
	            .map(n -> n * n)                           // Square each number
	            .sum();                                   // Sum all squared numbers

	        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
	}

}
