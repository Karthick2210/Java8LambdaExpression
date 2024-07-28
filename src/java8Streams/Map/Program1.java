package java8Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	
	public static void main(String[] args) {
		
		List<String> vehical =  Arrays.asList("rockey","aidren","creed","mickey");
		List<String>upperCaseVehicle = new ArrayList<String>();
		
		upperCaseVehicle = vehical.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseVehicle);
	}
	
}
