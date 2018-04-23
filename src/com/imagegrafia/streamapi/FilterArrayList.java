package com.imagegrafia.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterArrayList {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.addAll(Arrays.asList("Ashish", "","Rintu", "Kaju", "Surila", "Newtam", "Alok", "Bala", "Sanjeev"));

		// filerName Starts with A
		List<String> filterNameList = new ArrayList<>();
		filterNameList = nameList.stream().filter((str) -> str.startsWith("A")).collect(Collectors.toList());

		System.out.println(filterNameList); // [Ashish, Alok]

		// Print all Name from NameList
		nameList.stream().forEach(System.out::println);

		// capitalize All Name into nameList
		nameList = nameList.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(nameList);
		// Sort (asc) All Name into nameList
		nameList = nameList.stream().sorted().map((str) -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(nameList);
		
		//Count particular name starts with "A" 
		System.out.println(nameList.stream().filter((str)-> str.startsWith("A")).count());
		//print all name from list in lower case
		nameList.stream().map(str-> str.toLowerCase()).forEach(System.out::println);
	
		//check is any list empty ?? put it into set
		Set<String> nameSet=nameList.stream().filter(x-> !x.isEmpty()).collect(Collectors.toSet());
		System.out.println(nameSet);
	}
	//


}
