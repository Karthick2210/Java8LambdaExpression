package java8Streams.StreamsMethods2;

import java.util.HashSet;
import java.util.Set;

//AllMatch
//AnyMatch
//NoneMatch
public class Program2 {
	public static void main(String[] args) {
		
		
		//AnyMatch
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("one apple");
		fruits.add("one apple");
		fruits.add("one apple");
		fruits.add("one apple");
		fruits.add("one apple");
		
		//anyMatch()
		boolean result=fruits.stream().anyMatch(value ->{return value.startsWith("one");});
		System.out.println(result);
		
		//allMacth()
		boolean result1=fruits.stream().allMatch(value ->{return value.startsWith("one");});
		System.out.println(result1);
		
		//noneMatch
		boolean result12=fruits.stream().noneMatch(value ->{return value.startsWith("two");});
		System.out.println(result12);
		
		
		
	}

}
