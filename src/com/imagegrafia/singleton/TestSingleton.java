package com.imagegrafia.singleton;

//1. make class constructor private so that from outside obj creation is not possible
//2. To check condition if it is null or not we need variable i.e private so that it cannot be accessed by Class Name and static  initialize once per application
//else returning new SingletonObject will create object on every method call even though constructor is private

public class TestSingleton {
	public static void main(String[] args) {
		
		//1. SingletonObject but Not Thread safe
		
		SingletonObject so=SingletonObject.getSingletonInstance();
		System.out.println(so); //com.imagegrafia.singleton.SingletonObject@70dea4e
		SingletonObject so1=SingletonObject.getSingletonInstance();
		System.out.println(so1);  //com.imagegrafia.singleton.SingletonObject@70dea4e
		
		//2.SingletonObjectThreadSafe performance wise also no problem

		SingletonObjectThreadSafe sots=SingletonObjectThreadSafe.getSingletonInstanceObject();
		SingletonObjectThreadSafe sots1=SingletonObjectThreadSafe.getSingletonInstanceObject();
		SingletonObjectThreadSafe sots2=SingletonObjectThreadSafe.getSingletonInstanceObject();
	
		System.out.println(sots); //com.imagegrafia.singleton.SingletonObjectThreadSafe@5c647e05
		System.out.println(sots1);
		System.out.println(sots2);
		
		//3. how to implement Singleton class object Thread safe without Synchronization
		SingletonInnerClass sic=SingletonInnerClass.getInstance();
		SingletonInnerClass sic1=SingletonInnerClass.getInstance();
		SingletonInnerClass sic2=SingletonInnerClass.getInstance();
		
		System.out.println(sic); //com.imagegrafia.singleton.SingletonInnerClass@33909752
		System.out.println(sic1);
		System.out.println(sic2);
		
		//4.
		SingletonFinal sf=SingletonFinal.getInstance();
		SingletonFinal sf1=SingletonFinal.getInstance();
		SingletonFinal sf2=SingletonFinal.getInstance();
		System.out.println(sf);
		System.out.println(sf1);
		System.out.println(sf2);
		
	}

}
