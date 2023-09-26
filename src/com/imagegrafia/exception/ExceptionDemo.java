package com.imagegrafia.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		
			try {
				if(a==10)
				throw new CreateCheckedException("You are not eleigible");
			} catch (CreateCheckedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}

}
