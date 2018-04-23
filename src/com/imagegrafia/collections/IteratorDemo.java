package com.imagegrafia.collections;

import java.util.ArrayList;
import java.util.List;

import com.imagegrafia.model.Product;

public class IteratorDemo {
	
	List<Product> listProduct=new ArrayList<>();
	public static void main(String[] args) {
		
		IteratorDemo id=new IteratorDemo();
		id.listProduct.add(new Product(1, "cret", 123.0f, 12));
		id.listProduct.add(new Product(2, "cret", 123.0f, 12));
		id.listProduct.add(new Product(3, "cret", 123.0f, 12));
		id.listProduct.add(new Product(4, "cret", 123.0f, 12));
		
		System.out.println(id.listProduct.stream());
	}

}
