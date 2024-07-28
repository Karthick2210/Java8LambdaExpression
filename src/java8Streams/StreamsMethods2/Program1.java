package java8Streams.StreamsMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {

		List<Integer> nonsort = Arrays.asList(1,8,0,9,89,78,76,354,45);
		List<Integer>sortArr =nonsort.stream().sorted().collect(Collectors.toList());
		System.out.println(sortArr);
		List<Integer> revSort = 
				nonsort.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(revSort);

	}

}
