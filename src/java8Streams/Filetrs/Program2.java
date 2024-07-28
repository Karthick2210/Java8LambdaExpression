package java8Streams.Filetrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Rockey","Aidren","Creed","Paulie","Appolo");
		
		List<String> longNames = new  ArrayList<String>();
		
		longNames = names.stream().filter(str -> str.length()<8 && str.length()>4)
				.collect(Collectors.toList());
		System.out.println(longNames);
	}
}
