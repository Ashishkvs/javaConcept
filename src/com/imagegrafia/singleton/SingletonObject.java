package com.imagegrafia.singleton;

//1. make class constructor private so that from outside obj creation is not possible
//2. To check condition if it is null or not we need variable i.e private so that it cannot be accessed by Class Name and static  initialize once per application
//else returning new SingletonObject will create object on every method call even though constructor is private

public class SingletonObject {
	
	
	//1.
	private SingletonObject() {
		
	}
	//2.
	private static SingletonObject INSTANCE;
	
	public static  SingletonObject getSingletonInstance() {
		if(INSTANCE==null) {
		INSTANCE =new SingletonObject();
		}
		return INSTANCE;
	}

}

//BUT THIS APPROCAH IS NOT THREAD SAFE if Multiple Thread acts same time it may get seperate instance
