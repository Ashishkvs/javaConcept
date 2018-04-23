package com.imagegrafia;

/*
 *condition ? exprTrue : exprFalse
 *The condition is a boolean expression that evaluates to either true or false.
 * Both, exprTrue and exprFalse are also expressions but they can evaluate to
 *  anything you want them to (except void). If the condition is true, 
 *  the ternary operator evaluates exprTrue. Otherwise exprFalse is evaluated.
 * */

public class TernaryOperator {
	public static void main(String[] args) {

		int x = 5;
		if (x % 2 == 0) {
			System.out.println("Even No");

		} else {
			System.out.println("Odd No");
		}
		//TERNARIY OPERATOR
		String noIs= x%2 == 0 ? "Even" :"Odd";
		System.out.println(noIs);
		//OR
		
		
		

	}

}
