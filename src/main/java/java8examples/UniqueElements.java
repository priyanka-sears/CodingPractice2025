package java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
	
	public static void main(String args[]) {
		
		List<Integer> elements=Arrays.asList(1,3,4,5,5,5,3,3);	
		
		List<Integer> uniqueElements=elements.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueElements);
		
		uniqueElements.forEach(e -> System.out.println(e));
		
		
		List<String> elementStrings= Arrays.asList("apple","pen","apple","Pen");
		
		List<String> uniqueStrings = elementStrings.stream().distinct().toList();
		
		System.out.println(uniqueStrings); 
				
	}

}
