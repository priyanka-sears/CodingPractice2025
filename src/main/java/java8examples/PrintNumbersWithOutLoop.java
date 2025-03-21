package java8examples;

import java.util.stream.IntStream;

public class PrintNumbersWithOutLoop {
	
public static void main(String argsc[]) {
	 printNumbers(0, 10);
	 
	 /*IntStream class to generate a range of numbers and then print them. This approach leverages the functional programming capabilities of Java 8 streams.*/
	 IntStream.rangeClosed(0, 10)  // Generates numbers from 0 to 10, inclusive
     .forEach(System.out::println);  // Prints each number
}

private static void printNumbers(int start, int end) {
    if (start <= end) {
        System.out.println(start);
        printNumbers(start + 1, end);  // Recursive call
    }
}

}
