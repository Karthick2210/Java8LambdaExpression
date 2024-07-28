package java8Streams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	int id;
	String Name;
	int section;

	public Student(int id, String name, int section) {
		this.id = id;
		Name = name;
		this.section = section;
	}

}

public class Program2 {

	public static void main(String[] args) {
		
		List<Student> section1 = new ArrayList<Student>();
		section1.add(new Student(1, "abhi", 1));
		section1.add(new Student(2, "Kiran", 1));
		section1.add(new Student(3, "Karthik", 1));
		section1.add(new Student(4, "Praveen", 1));
		
		
		List<Student> section2 = new ArrayList<Student>();
		section2.add(new Student(1, "Leela", 2));
		section2.add(new Student(2, "Tanju", 2));
		section2.add(new Student(3, "Prakruthi", 2));
		section2.add(new Student(4, "Abhinaya", 2));
		
		List<List<Student>> studentDb = Arrays.asList(section1,section2);
		
		List<String> finalList =studentDb.stream().flatMap(c->c.stream().map(x->x.Name)).collect(Collectors.toList());
		
		System.out.println(finalList);
		
		
		
		

	}

}
