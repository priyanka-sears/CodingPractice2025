package mapexamples;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurancesOfWord {

	public static void main(String[] args) {
		String sentence = "this is big  basket it is very big";

		String[] words = sentence.trim().split("\\s+"); // \\s+ for one or more white spaces

		Arrays.stream(words).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + ":" + value));

		// print the words those are repeated
		String[] word = sentence.split("\\s+");

		Map<String, Long> repeatedWords = Arrays.stream(word)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		repeatedWords.entrySet().stream().forEach(x -> {
			if (x.getValue() > 1) {
				System.out.println(x.getKey() + ":" + x.getValue());
			}
		});

	}
}
