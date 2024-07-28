package java8Streams.StreamsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program3 {

	public static void main(String[] args) {

		
		List<String> numbers = Arrays.asList("A","9","8","B","E","q");
		
		Optional<String> redNum =numbers.stream().reduce((val1,val2)->{
			return val1+val2;});
		System.out.println(redNum.get());
		
	Object arr[] =	numbers.stream().toArray();
	System.out.println(arr.length);
	
	if(arr.length!=0)
	{
		for (Object val : arr) {
			
			System.out.print(val);
			
		}
	}
		
		}
	

	}


