package com.imagegrafia.singleton;

//? Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block that provides option for exception handling.
/**
 * 
 * @author ashish
 *Both eager initialization and static block initialization 
 *creates the instance even before it’s being used and that is
 * not the best practice to use. 
 */
public class SingletonStatic {
	
	private SingletonStatic() {}
	
	private static SingletonStatic INSTANCE;
	
	//static block for exception handling
	static {
		try {
			INSTANCE=new SingletonStatic();
		}catch(Exception e) {
			System.out.println("Exception while creating object");
		}
	}
	
	public static  SingletonStatic getInstance() {
		
		return  INSTANCE;
	}

}
