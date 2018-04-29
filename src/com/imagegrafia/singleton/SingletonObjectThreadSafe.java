package com.imagegrafia.singleton;

//3. if we Synchronized whole method it effect performance issue
//4. double check condition then synchronized apart of method only when Instance is Null 
//otherwise no synchronization is req. and performance wise also good

public class SingletonObjectThreadSafe {

	//1.
	private SingletonObjectThreadSafe(){}
	
	//2.
	private static volatile SingletonObjectThreadSafe INSTANCE;
	
	//3.
	public static SingletonObjectThreadSafe getSingletonInstanceObject() {
	
		if(INSTANCE==null) {
			
			//4.
			synchronized (SingletonObjectThreadSafe.class) {
				if(INSTANCE==null) {
					INSTANCE= new SingletonObjectThreadSafe();

				}
			}
		}
		return INSTANCE;
	}

}
