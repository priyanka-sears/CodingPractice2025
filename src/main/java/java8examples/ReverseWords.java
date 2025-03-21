package java8examples;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {
	
 public static void main(String args[]) {
	 
	 String sentence="I love Java";
	 
	 String[] words = sentence.split(" ");
	 
	 Stream<String> wordList=  Stream.of(words);
	 
	 String result= wordList.map(w -> new StringBuilder(w).reverse().toString())
	 .collect(Collectors.joining(" "));
	 
	 System.out.println(result);
	 
	 
	 String result2= Stream.of(sentence.split(" ")).map(w -> new StringBuilder(w).reverse().toString())
			 .collect(Collectors.joining(" "));
	 
	 System.out.println(result2);
	 
 }

}
