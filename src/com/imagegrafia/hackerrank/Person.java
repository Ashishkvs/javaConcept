package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class Person {

	 private int age;	
	  private String msg="";
		public Person(int initialAge) {
	  		// Add some more code to run some checks on initialAge
	        if(initialAge<0){
	            this.age=0;
	            System.out.println("Age is not valid, setting age to 0.");
	        }else {
	        	this.age=initialAge;
	        }
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
	    if(age<13) {
	    	   msg="You are young.";
	       }
	       else if(age>=13 & age<18) {
	    	   msg="You are a teenager.";
	       }else {
	    	   msg="You are old.";
	       }
			System.out.println(msg);
		}

		public void yearPasses() {
	  		// Increment this person's age.
			this.age=age+1;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();  //1
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt(); //15
				Person p = new Person(age); //15
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }

	}

