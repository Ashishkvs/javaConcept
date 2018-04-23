package com.imagegrafia;

import java.math.BigInteger;

public class FibonacciWithoutRecursion {
	//0 1 1 2 3 5 8 13 21 34 55 89
	public static void main(String[] args) {
		
	int number=11;
	BigInteger n1=new BigInteger("0");
	BigInteger n2=new BigInteger("1");
	
	BigInteger n3=new BigInteger("0");
	
	System.out.println(n1 +"\n"+ n2);
	
	for(int i=2;i<number;i++) {
		n3=n1.add(n2);
		System.out.println(n3);
		n1=n2;
		n2=n3;
		
	}
	System.out.println(n3);
}
	}
