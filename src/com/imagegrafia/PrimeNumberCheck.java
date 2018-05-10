package com.example.demo;

public class PrimeNumberCheck {

	/**
	 * 
	 * @author imagegrafia Check no is prime or not
	 */

	// check a no is prime or not ie factor must be 1 and itslef

	public static void main(String[] args) {
		int n = 6;
		// if any no is not divisible by half of its number it will not divisible by any
		// further no so check it till half of given number
		String msg = "prime no";
		if (n == 0 || n == 1) {
			// do nothing simple else block will ignore and print will default msg
		} else if (n > 2) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					msg = "Not a prime no";
					break;
				}
			}
		}
		System.out.println(n + " " + msg);

	}

}
