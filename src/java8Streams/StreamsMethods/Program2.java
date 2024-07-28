package java8Streams.StreamsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program2 {

	public static void main(String[] args) {
		
		//Count
		List<Integer> numbers = Arrays.asList(2,3,3,45,54,6,8,10);
		long evenum = numbers.stream().filter(num -> num%2==0).count();
		System.out.println(evenum);
		
		
		//Min()
		Optional<Integer> minNum =numbers.stream().min((val1,val2)->{ return val1.compareTo(val2);});
		System.out.println(minNum.get());
		
		//Max()
		Optional<Integer> maxNum =numbers.stream().max((val1,val2)->{ return val1.compareTo(val2);});
		System.out.println(maxNum.get());
	}

}
