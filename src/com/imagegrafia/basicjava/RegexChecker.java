package com.imagegrafia.basicjava;

public class RegexChecker {

	public static void main(String[] args) {
		String text= "Ashish is a good boy";
		String regexPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean isMatch = text.matches("/./");

		System.out.println(isMatch);
	}
}
