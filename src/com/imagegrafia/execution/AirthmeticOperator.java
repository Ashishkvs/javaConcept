package com.imagegrafia.execution;

import java.io.IOException;

public class AirthmeticOperator {
	public static void main(String[] args) {
		int p = 10 * 20 - 20; // left to right execution held
		System.out.println(p); // 180

		// 2.
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.print(x);
		// 3
		try {
			throw new Exception("Hello ");
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		/*
		 * catch(IOException e) { //Unreachable catch block for IOException. It is
		 * already handled by the catch block for Exception
		 * 
		 * System.out.print(e.getMessage()); }
		 */
		finally {
			System.out.println("World");
		}
		// compile error
		//3.
		char c = 65;
		System.out.println("c = "+c);
		//4.
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2); //false
		/**
		 * As + operator precedence is more than  == 
		 *so it will act as ((s1==s2 is :+s1) ==s2)) //false
		 */
		//however
		System.out.println(s1==s2);//true  as constant pool rule
		//5.
		try {
			throw new IOException("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("HEL");
		}
		/*catch(IOException | Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
