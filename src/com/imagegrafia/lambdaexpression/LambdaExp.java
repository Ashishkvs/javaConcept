package com.imagegrafia.lambdaexpression;

interface TwoArgumentsFunctionalInterface {
	/**
	 * we can now hold static and default method into interface but need to implement only abstract method only
	 * 
	 * But to call default method we need to follow static and non-static convention
	 * To call non-static "default" method of interface we need to implement that interface into our class and then 
	 * call by using syntax  <interface_name>.super.<method_name>
	 * @param a
	 * @param b
	 * @return
	 */

	int sum(int a, int b);
}

// public class LambdaExp{
public class LambdaExp implements FunctionalInterfaceDemo {
	// ONLY NEED TO IMPLEMENT ABSTRACT METHOD OF INTERFACE need NOT to implement default
	// & STATIC method of interface
	
	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	public int showDisplay() {
		
		// call default method of interface
		FunctionalInterfaceDemo.super.showinfo();
		return 10;
	}

	public static void main(String[] args) {
		LambdaExp le = new LambdaExp();

		System.out.println(le.showinfo());

	}

	/*
	 * public static void main(String[] args) { //declaring body of an interface
	 * FunctionalInterfaceDemo
	 * fid=()->{System.out.println("interface Message method impl ");};
	 * 
	 * //System.out.println(fid); // object hashcode fid.message(); ////call
	 * implemented method of interface
	 * 
	 * //declaring body of an interface TwoArgumentsFunctionalInterface tai=(int
	 * a,int b)->{return a+b;}; System.out.println(tai.sum(5, 10)); //call
	 * implemented method of interface }
	 */
}
