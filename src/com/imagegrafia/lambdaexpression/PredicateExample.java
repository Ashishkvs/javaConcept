package com.imagegrafia.lambdaexpression;

import java.util.function.Predicate;

public class PredicateExample {

	public boolean checkNum(int i) {
		if (i > 10) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		/*PredicateExample pe = new PredicateExample();
			System.out.println(pe.checkNum(15));
	*/		
			Predicate<Integer> gt=(i)-> i < 100; //implementation of test () of Predicate interface
			System.out.println(gt.test(15));
			
			Predicate<String> st=(str)-> str=="Ashish";
			System.out.println(st.test("Ashishk"));
			//focus this above is same
			System.out.println(5>10);
	}
}
