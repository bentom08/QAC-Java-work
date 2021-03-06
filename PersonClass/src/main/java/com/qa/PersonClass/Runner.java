package com.qa.PersonClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		Person gaz = new Person("Gareth", 23, "QA Consultant");
		Person joseph = new Person("Joseph", 24, "QA Consultant");
		Person ben = new Person("Ben", 25, "Infosys Consultant");
		
		List<Person> candidates = Arrays.asList(gaz, joseph, ben);
		
		candidates.stream().forEach(p -> System.out.println(p.toString()));
		
		System.out.println(searchName("Ben", candidates));
	}
	
	public static List<Person> searchName(String name, List<Person> list) {
		return list.stream().filter(p -> name == p.getName()).collect(Collectors.toList());
	}
}