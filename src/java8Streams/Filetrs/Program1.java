package java8Streams.Filetrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
	
	public static void main(String[] args) 
	{
		
		//Program to store the even numbers from one collection to another
		
		List<Integer> integers = Arrays.asList(12,13,2,23,45,987,890);
		
		List<Integer> evenNum = new ArrayList<Integer>();
		
		/*for (Integer integer : integers) {
			
			if (integer%2==0) {
				
				list.add(integer);
				System.out.println(integer);
				
			}
			
		}*/
		//Using streams concept
		
		evenNum=integers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
		//Without storing in another Collection
		
		integers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
	}

}
