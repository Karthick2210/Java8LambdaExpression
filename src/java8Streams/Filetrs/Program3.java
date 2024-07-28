package java8Streams.Filetrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("","","Rockey","Aidren",null,"Creed",null,"Paulie",null,"Appolo");
		
	List<String> longNames = new  ArrayList<String>();
	
	longNames= names.stream().filter(w->w==null).collect(Collectors.toList());
	System.out.println(longNames);
		
		
	}

}
