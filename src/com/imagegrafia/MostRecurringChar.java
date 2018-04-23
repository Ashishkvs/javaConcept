package com.imagegrafia;

public class MostRecurringChar {
	public void mostOccuringCharacter(String str) {
		//String str = "Hello world";
		//str=str.toLowerCase(); if we ignore case 
		int maxTimes=0;
		char ch=' ';
		
		for (int i = 0; i < str.length(); i++) {
			int j = str.length() - 1; // 10 length of string -1 bcz 1 char hold by left pointer
			int cv = 0;  //current value occuring times
			while (j > i) {

				if (str.charAt(i) == str.charAt(j)) {
					cv++;
					//compare left pointer with right pointer
					//if match found increment current value i.e cv
				}
				//whether match found or not decrement j by 1 after each comparison
				j--;

			}
			//intially store maxTimes with 0 after finding 1 or more occurence store max value till current loop
			if(cv>maxTimes) {
				maxTimes=cv;
				ch=(char)str.charAt(i);
			}
			
			//System.out.println(ch + cv); //giv integer value
			//as we know with + operator char converted into  integer
			
		}
		System.out.println("Most occur char : "+(ch));
		System.out.println("Total occurence :"+(maxTimes+1));

	}
	public static void main(String[] args) {

		MostRecurringChar mrc=new MostRecurringChar();
		mrc.mostOccuringCharacter("Hello World");
	}
}