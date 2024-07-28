package java8Streams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> l1 = Arrays.asList(1,2);
		List<Integer> l2 = Arrays.asList(2,3);
		List<Integer> l3 = Arrays.asList(3,4);
		
		List<List<Integer>> combList = Arrays.asList(l1,l2,l3);
		
		//Without any operation
		//List<Integer> finalList =combList.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		
		
		//With  operation
		List<Integer> finalList =combList.stream().flatMap(x-> x.stream().map(n->n+10)).collect(Collectors.toList());
				
		
		System.out.println(finalList);
		
	}

}
