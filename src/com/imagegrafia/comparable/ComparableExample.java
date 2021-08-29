package com.imagegrafia.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String... args) {
		Student s1 = new Student(100, "Kajal", 24);
		Student s2 = new Student(75, "Anupam", 29);
		Student s3 = new Student(102, "Rohit", 18);
		List<Student> list = Arrays.asList(s1, s2, s3);
		System.out.println("Before Sorting" + list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Student implements Comparable<Student> {

	int roll;
	String name;
	int age;

	Student(int roll, String name, int age) {
		this.roll = roll;
		this.age = age;
		this.name = name;

	}

	public String toString() {

		return "roll:" + roll + ", name: " + name + ", age: " + age;
	}

//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(this.age, o.age); // increasing order
//
//	}

//	@Override
//	public int compareTo(Student o) {
//
//		int i = -1;
//
//		if (this.age == o.age)
//			return 0;
//		if (this.age > o.age) {
//			i = 1;
//		} else {
//			i = -1;
//		}
//		return i;
//
//	}

	@Override
	public int compareTo(Student o) {

		return this.age > o.age ? 1 : (this.age == o.age ? 0 : -1);
	}
}