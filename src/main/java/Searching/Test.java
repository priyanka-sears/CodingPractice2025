package Searching;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		List<String> cities = new ArrayList<String>();
		   cities.add("Delhi");
		   cities.add("Mumbai");
		   cities.add("Goa");
		   cities.add("Pune");
		   
		List<String> matchingCities=   cities.stream().filter(s->s.equalsIgnoreCase("Pune")).collect(Collectors.toList()); 

		   System.out.println(matchingCities);
		   
	}

}
