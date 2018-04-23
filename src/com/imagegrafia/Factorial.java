package com.imagegrafia;
/**
 * 
 * @author ashish
 *	Factorial using loop
 *
 */
public class Factorial {
	public int fact(int n) {
		if(n<=1) {
		//for 0 & 1;
			return 1;
		}
		
		int fact=1;
		while(n>1) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
	
		Factorial f=new Factorial();
		System.out.println(f.fact(5));
	}

}
