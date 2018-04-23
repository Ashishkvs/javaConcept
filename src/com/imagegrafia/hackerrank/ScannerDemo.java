package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int num2=0;
        double dnum=0.0d;
        String name="";
        /* Read and save an integer, double, and String to your variables.*/
        num2=scan.nextInt();
        dnum=scan.nextDouble();
                name=scan.next();
                name+=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+num2);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+dnum);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
    System.out.println(s+name);
	}

}
