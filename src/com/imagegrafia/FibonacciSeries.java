package com.imagegrafia;

/*
 * *
 *
 * Not allowed for big number like 100 th term
 */

public class FibonacciSeries {
	
	static int fib(int n)
	{
	if (n <= 1)
	return n;
	return fib(n-1) + fib(n-2);
	}
	
	public static void main (String args[])
	{
	
	System.out.println(fib(17));
	}
}
