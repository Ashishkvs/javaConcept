package com.omsent.java8;

public class LamdaArgument1 {

	public void math(LambdaSample1 lambdaSample1) {
		lambdaSample1.logInfo();
	}

	

	void testLambdaArguments() {
		// case 1
		math(() -> System.out.println("case 1 : Ashish here"));

		// case 2
		LambdaSample1 lambdaSample1 = () -> {
			int y = 10;
			System.out.println("case 2" + y);
		};
		math(lambdaSample1);
	}

	public static void main(String[] args) {
		new LamdaArgument1().testLambdaArguments();
	}
}
