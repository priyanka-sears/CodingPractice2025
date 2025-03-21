package java8examples;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFinder {
	public static void main(String[] args) {
		String input = "swiSSnbbkff";
		int nth = 2; // Example: change this to the nth position you want to find

		System.out.println("The " + nth + "th repeating character: " + fixndNthRepeatingCharacter(input, nth));
		System.out.println("The " + nth + "th non-repeating character: " + fixndNthNONRepeatingCharacter(input, nth));
	}

	private static Character fixndNthNONRepeatingCharacter(String input, int nth) {
		Map<Character, Long> charMap = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		return charMap.entrySet().stream()
				.filter(c -> c.getValue() == 1)
				.map(Map.Entry::getKey)
				.skip(nth - 1)
				.findFirst()
				.orElse(null);
	}

	private static Character fixndNthRepeatingCharacter(String input, int nth) {
		Map<Character, Long> charaterMap = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> (char) c, Collectors.counting()));

		return charaterMap.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				// .sorted(Map.Entry.comparingByKey())
				.map(Map.Entry::getKey)
				.skip(nth - 1)
				.findFirst()
				.orElse(null);
	}
}
