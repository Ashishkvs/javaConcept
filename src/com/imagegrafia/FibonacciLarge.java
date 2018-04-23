package com.imagegrafia;

import java.math.BigInteger;

/**
 * 
 * @author Ashish
 *
 *         fibonacci series are like this // 0 1 1 2 3 5 8 13 21 34 55 89 which
 *         follow sum of 2 preceding number
 */

public class FibonacciLarge {

	// 0 1 1 2 3 5 8 13 21 34 55 89
	public static void main(String[] args) {

		int number = 100;
		// Primitive data type doesn't allows this big no
		// So we will use BigInteger here in order to store large number

		BigInteger firstTerm = new BigInteger("0");
		BigInteger secondTerm = new BigInteger("1");

		BigInteger nextTerm = new BigInteger("0");

		if (number > 1 & number <= 2) {
			nextTerm = nextTerm.add(secondTerm);
		} else {
			for (int i = 2; i < number; i++) {
				/**
				 * we ll assume here 2 fixed term 1st and 2nd i.e why we ll start loop from 2
				 * till the nth term (number passed)
				 * in order to get nextTerm add 2 prev number
				 */
				nextTerm = firstTerm.add(secondTerm);
				firstTerm = secondTerm; //swap the 1st term with second term
				secondTerm = nextTerm; ////swap the 2nd term with next term
				
				//continue the loop till we achieve the passed number
			}
		}
		System.out.println(nextTerm);  //print
	}
}
