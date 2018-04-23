package com.imagegrafia;
/**
 * Factrorial Using Recursion
 */
public class FactorialRecursion {
	
	public int fact(int n) {
		if(n>1) {
		return n*fact(n-1);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		FactorialRecursion fr=new FactorialRecursion();
		int x=fr.fact(5);
		System.out.println(x);//
	}

}
