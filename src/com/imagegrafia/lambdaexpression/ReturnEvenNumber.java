package com.imagegrafia.lambdaexpression;

import java.util.function.Predicate;

public class ReturnEvenNumber {
	public static void main(String[] args) {
		Integer arr[] = { 2, 3, 7, 9, 10, 11, 18, 35, 75, 45 };

		// filter even no from above array;
		Predicate<Integer> pdEven = (num) -> num % 2 == 0;
		for (Integer i : arr) {
			if (pdEven.test(i))
				System.out.println(i);
		}
		// filter odd no from above
		Predicate<Integer> pdOdd = (num) -> num % 2 != 0;
		for (Integer k : arr) {
			if (pdOdd.test(k))
				System.out.println(k);
		}

		// join two predicates USELESSLOGIC
		Predicate<Integer> demo = pdEven.or(pdOdd);
		System.out.println(demo.test(17));

		// JOIN PREDICATES
		Predicate<Integer> greater, smaller, join;
		greater = num -> num > 10;
		smaller = num -> num < 75;
		display(greater.and(pdOdd), arr);
	}

	public static void display(Predicate<Integer> pd, Integer arr[]) {
		for (Integer i : arr) {
			if (pd.test(i))
				System.out.println(i);
		}
	}
}
