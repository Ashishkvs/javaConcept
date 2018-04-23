package com.imagegrafia.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.imagegrafia.model.Product;

public class PredicateExample2 {

	public static void main(String[] args) {
		Integer arr[] = { 4, 5, 8, 9, 11, 75, 45, 16 };

		// check num lying between 10 and 20 from above integer
		Predicate<Integer> pd = (i) -> i > 10 & i < 20; // true or false

		for (Integer i : arr) {
			if (pd.test(i))
				System.out.println(i + " : " + pd.test(i));
		}
		// 2nd example
		String[] name = { "Ashish", "Rintu", "Bala", "Karan" };
		Predicate<String> pdName = (strName) -> strName == "Bala";

		for (String nam : name) {
			if (pdName.test(nam)) {
				System.out.println(nam);
			}
			;
		}
		// 3rd example
		List<Product> productList = new ArrayList<>();
		productList.addAll(Arrays.asList(new Product(1, "Apple", 500.f, 2), new Product(2, "Macbook", 500.f, 12),
				new Product(1, "Apple", 500.f, 2), new Product(2, "Hp", 500.f, 13), new Product(1, "acer", 500.f, 5),
				new Product(2, "asus", 1500.f, 12)));
		// System.out.println(productList);

		// filter product by NAME;
		// Predicate<String> pdt=(product)-> product=="Apple";
		Predicate<String> pdt = (product) -> product.equalsIgnoreCase("Apple");

		for (Product prod : productList) {
			if (pdt.test(prod.getName())) {
				System.out.println(prod);
			}

		}
		System.err.println(productList.stream().count());

	}
}
