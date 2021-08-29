package com.imagegrafia;

/**
 * 
 * @author imagegrafia print PRIME NO IN A RANGE
 */
public class PrimeNumberInRange {
	
	// print range of prime number
	public static String primeRange(int from, int to) {
		String msg = "";
		while (from <= to) {
			int loopSize = from / 2;
			int counter = 0;
			// check no is prime using counter
			for (int i = 2; i <= loopSize; i++) {
				if (from % i == 0) {
					counter++;
				}
			}
			// as we have counter 0 by default so for even range for 1 to 11 it will print 1
			// and 2 as prime number
			// single increment also loose prime characteristics so check with 0
			if (counter == 0) {
				msg += from + " ";
			}

			from++; // check from intial "from" to final "to" after checking increment "from" by 1

		}
		return msg;
	}

	public static void main(String[] args) {
		System.out.println(primeRange(10, 30));

	}
}
