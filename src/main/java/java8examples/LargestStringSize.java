package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class LargestStringSize {

	public static void main(String args[]) {
		List<String> words = Arrays.asList("one", "two", "three");
		OptionalInt maxSize = words.stream().mapToInt(String::length).max();
		maxSize.ifPresentOrElse(length -> System.out.println("Max size : " + length),
				() -> System.out.println("empty String"));

	}

}
