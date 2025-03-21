package java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.lang.*;
import java.util.stream.Collectors;

public class StringBasedQuestion {
	public static void main(String args[]) {
		List<String> strings = new ArrayList<String>();
		strings.add(null);
		strings.add("abc");
		List<String> uppercasedStrings = strings.stream().map(s -> s != null ? s.toUpperCase() : null)
				.collect(Collectors.toList());

		List<String> uppercasedStringsValues = strings.stream().filter(s -> s != null).map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println("List of strings :" + uppercasedStrings);

	}
}
