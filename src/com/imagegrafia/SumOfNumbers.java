package com.example.demo;

public class SumOfNumbers {

	public int sumofDigits(long num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(new SumOfNumbers().sumofDigits(12312398));
	}
}
