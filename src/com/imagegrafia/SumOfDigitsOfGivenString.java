package com.imagegrafia;

import java.util.Scanner;

public class SumOfDigitsOfGivenString {

	public int getSumOfDigit(String num) {
		int sum=0;
		for(int i=0;i<num.length();i++) {
			String charAt =""+ num.charAt(i); //concat char "digit " with "" empty and parse it
			int x=Integer.parseInt(charAt); //to convert string to digit
			sum+=x;
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfDigitsOfGivenString sd=new SumOfDigitsOfGivenString();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		//store all input in array
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			String temp=sc.next();
			arr[i]=temp;
		}
		//print array
		for(String k:arr) {
			System.out.println(sd.getSumOfDigit(k));
		}
		
	}

}
