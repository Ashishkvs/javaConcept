package com.imagegrafia.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String... args) {
		Employee s1 = new Employee(100, "Kajal", 24);
		Employee s5 = new Employee(25, "Kajal", 45);
		
		Employee s2 = new Employee(75, "Anupam", 29);
		Employee s3 = new Employee(102, "Rohit", 18);
		List<Employee> list = Arrays.asList(s1, s2, s3,s5);
		System.out.println("Before Sorting" + list);

//		Comparator<Employee> empComparator = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
////				return o1.empId > o2.empId ? 1 : (o1.empId == o2.empId ? 0 : -1);
//				return o1.name.compareTo(o2.name);
//			}
//		};
		
//		Comparator<Employee> byNameComparator = (o1,o2)->o1.empId > o2.empId ? 1 : (o1.empId == o2.empId ? 0 : -1);
//		Comparator<Employee> byAge = (o1,o2)->o1.age.compareTo(o2.age);
//		Collections.sort(list, (o1,o2)->o1.name.compareTo(o2.name));
//		list.sort((o1,o2)->o1.name.compareTo(o2.name));
		
//		Collections.sort(list, (o1,o2) -> {o1.equals(o2)});
		System.out.println(list);
		
		//Multiple condition sorting and keep higer age first 
		Comparator<Employee> byNameThenAgeComparator = (o1,o2)->{
			if(o1.name.equalsIgnoreCase(o2.name)) {
				//swap o1 and o2
				return Integer.compare(o2.age, o1.age);
			}
			return o1.empId > o2.empId ? 1 : (o1.empId == o2.empId ? 0 : -1);
					
		};
		list.sort(byNameThenAgeComparator);
		System.out.println(list);
	}
}

class Employee {
	int empId;
	String name;
	Integer age;

	Employee(int empId, String name, Integer age) {
		this.empId = empId;
		this.age = age;
		this.name = name;

	}

	public String toString() {

		return "empId:" + empId + ", name: " + name + ", age: " + age;
	}

}