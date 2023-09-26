package com.omsent.java8;

public class Java8Test {

	 LambdaSample1 lambdaSample1 = () -> {
		System.out.println(this);
	};

	public static void main(String[] args) {

		new Java8Test().lambdaSample1.logInfo();
	}
}
