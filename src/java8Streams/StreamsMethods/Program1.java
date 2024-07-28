package java8Streams.StreamsMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		
		
		List<String> vehicles = Arrays.asList("Bus","Bus","Car","Car","Van","Van");
		
		List <String> distVeh = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(distVeh);
		
		vehicles.stream().distinct().forEach(value-> System.out.println(value));
		
		long count = vehicles.stream().count();
		System.out.println(count);

		vehicles.stream().distinct().limit(3).forEach(value-> System.out.println(value));

		
		
	}

}
