package java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedString {

	public static void main(String[] args) {

		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Ebra");
		employeeNames.add("PRiyanka");
		employeeNames.add("KHAMKAR");
		employeeNames.add("Priyanka");
		employeeNames.add("khamkar");

		System.out.println(employeeNames);

		Map<String, Long> repeatedStringMap = employeeNames.stream()
				.collect(Collectors.groupingBy(S -> S, Collectors.counting()));

		// Step 2: Print original strings with their counts
		repeatedStringMap.forEach((key, value) -> System.out.println(key + ":" + value));

		// Step 3: Sort by value (case-insensitive) and print
		repeatedStringMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

		// Step 3: Sort by string (case-insensitive) and print
		List<Map.Entry<String, Long>> sortedEntries = repeatedStringMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());

		sortedEntries.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

		// Step 3: Sort descending by String (case-insensitive) and print
		repeatedStringMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed())
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
	}

}
