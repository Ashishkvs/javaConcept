package com.omsent.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBySample {

	public static void main(String[] args) {
		
		GroupBySample groupBySample = new GroupBySample();
		
		// test groupby stream count
		groupBySample.countChar("AbAcdA");
		//print all employee list without stream
//		groupBySample.getListOfEmploye().forEach(System.out::println);
		
		// filter male or female
		/*
		 * List<Employee> collect = groupBySample.getListOfEmploye().stream().filter(emp
		 * -> emp.getGender().equals("Male")).collect(Collectors.toList());
		 * collect.forEach(System.out::println);
		 */
		
		//group by male and female
		 Map<String, List<Employee>> collect2 = groupBySample.getListOfEmploye().stream().collect(Collectors.groupingBy(Employee::getGender));
		 System.out.println(collect2.get("Male"));
		 System.out.println(collect2.get("Female"));
		 
		 //group by salary range
		 groupBySample.getListOfEmploye().stream().collect(Collectors.groupingBy(Employee::getSalary));
	}
	
	public List<Employee> getListOfEmploye() {
		  // Creating List and adding Employees values.
		List<Employee> employeesList = new ArrayList<>();
 
        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));
        
        return employeesList;
	}
	
	
	public void countChar(String str) {
//		Map<String, Long> collect = Stream.of(str.ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		str.chars().forEach(data -> System.out.println((char)data));
//		str.chars().collect(Collectors.groupingBy(null), null, null)
//		System.out.println(collect);
	}
	
}
