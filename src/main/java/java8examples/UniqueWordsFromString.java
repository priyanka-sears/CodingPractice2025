package java8examples;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class UniqueWordsFromString {
	
	public static void main(String args[]) {
		
		String s="this is my college , is this My1 college";
		
		// Remove punctuation and split into words while preserving case sensitivity
		
		List<String> words=Arrays.stream(s.replaceAll("[^a-zA-Z ]","").split("\\s+")).collect(Collectors.toList());
		
		
		Map<String,Long> frequencyCount=words.stream().collect(Collectors.groupingBy(s1 -> s1,Collectors.counting()));
		
		System.out.println("Print word of frequency 1");
		
		frequencyCount.entrySet().stream()
		.filter(entry -> entry.getValue()==1)
		.forEach(entry -> System.out.println(entry.getKey()));
		
		// 
		
		String s2="this is my college is this My1 college";
		String[] word=s2.split("\\s+");
		
		Map<String,Long> frequencyOFWords=Arrays.stream(word).collect(Collectors.groupingBy(w -> w,Collectors.counting()));
		
		frequencyOFWords.entrySet().stream()
		.filter(e -> e.getValue()==1)
		.forEach(sp -> System.out.println(sp.getKey()));
	}

}
