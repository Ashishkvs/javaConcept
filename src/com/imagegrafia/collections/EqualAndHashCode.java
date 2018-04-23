package com.imagegrafia.collections;

import java.util.HashMap;

public class EqualAndHashCode {
	
	public static void main(String[] args) {
	
		Employee emp1=new Employee(1,"Ashish");
		Employee emp2=new Employee(1,"Ashish");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		HashMap<Employee, String> hashMap=new HashMap<>();
		hashMap.put(emp1,"Hello");
		hashMap.put(emp2, "Hello");
		System.out.println(hashMap);
		System.out.println(emp1.equals(emp2));
	}

}
