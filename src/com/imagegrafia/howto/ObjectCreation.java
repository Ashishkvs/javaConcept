package com.imagegrafia.howto;

import com.imagegrafia.model.Product;

public class ObjectCreation implements Cloneable {
	public static void main(String[] args) {

		// 1. Using new Keyword
		Product prod = new Product(10,"Apple", 100.5f, 10);
		System.out.println(prod);

		// 2.using Class.forName "MUST have default constructor"
		/**
		 * If we know the name of the class & if it has a public default constructor we
		 * can create an object in this way.
		 * 
		 */
		try {
			Product prod2 = (Product) Class.forName("com.imagegrafia.model.Product").newInstance();
			System.out.println(prod2);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. USING clone() method from object class
		/**
		 * The clone() can be used to create a copy of an existing object
		 */
		Product prod4 = null;
		try {
			prod4 = (Product) prod.clone();
			System.out.println(prod4);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prod.setName("holla");
		System.out.println(prod + " :" + prod4);// no effect if cloned obj even changed

		// 4. Using newInstance() method of constructor class
		try {
			Product prod5 = Product.class.newInstance();
			System.out.println(prod5);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//5. using deserialization
		/**
		 * Whenever we serialize and then deserialize an object JVM creates a separate
		 * object for us. In deserialization, JVM doesn�t use any constructor to create
		 * the object. To deserialize an object we need to implement the Serializable
		 * interface in our class.
		 * 
		 */

	}

}
