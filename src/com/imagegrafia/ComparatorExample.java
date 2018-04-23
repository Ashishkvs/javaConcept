package com.imagegrafia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.imagegrafia.model.Product;

public class ComparatorExample {
	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.addAll(Arrays.asList(new Product(1, "Apple", 500.0f, 10), new Product(2, "Hp", 5200.0f, 30),
				new Product(3, "Mac", 5500.0f, 20), new Product(4, "Dell", 1500.0f, 40))

		);

		System.out.println(productList); // Unordered list

		// ORDERED LIST
		Collections.sort(productList, new Comparator<Product>() {

			@Override
			public int compare(Product prod1, Product prod2) {
				// TODO Auto-generated method stub
				/**
				 * id is defined as int i.e primitive type so in order to make it object we r
				 * redef it as an integer x
				 */
				Integer x = prod1.getId();
				// return -x.compareTo(prod2.getId()); //for reverse order
				return prod1.getName().compareTo(prod2.getName()); // for sorted asc order
			}

		});
		System.out.println(productList); //ordered list of product based on Product Name

	}

}
