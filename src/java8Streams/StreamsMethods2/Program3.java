package java8Streams.StreamsMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program3 {
	
	public static void main(String[] args) {
		
		List<String> animls = Arrays.asList("Dog","cat","Buffelo");
		List<String> birds  = Arrays.asList("hen","chicken","parrot");
		
		Stream<String> stream1 = animls.stream();
		Stream<String> stream2 = birds.stream();

		
		List<String> finalStream = Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		for (String value : finalStream) {
			
			System.out.println(value);
			
		}
	} 	

}
