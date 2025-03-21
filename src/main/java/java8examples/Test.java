package java8examples;

import java.util.stream.IntStream;

// generate number from 1-100 and sum of even numbers 
//generate number from 1-100 and sum of odd and prime numbers 
//2 is a prime number , 1 is not prime 
public class Test {
	
	public static void main(String args[]) {
		
	int sum=	IntStream.rangeClosed(1, 100).filter(n -> n%2 ==0).sum();
	System.out.println("sum of even numbers :"+sum);
	// sum of numbers between 1-100 which are odd or prime numbers
	int sumOfOddAndPrimeNumbers=	IntStream.rangeClosed(1, 100)
									.filter(n -> n % 2 != 0 ||n == 2|| isPrime(n))
									.sum();
	System.out.println("sum of odd and prime numbers :"+sumOfOddAndPrimeNumbers);
	}

	
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;  // 0 and 1 are not prime
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
	}
}
