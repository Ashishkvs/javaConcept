package com.imagegrafia.singleton;

//?. how to implement Singleton class object Thread safe without Synchronization
//1. This static class also avoid eager intialization becz this will intanstiaate once method is called
public class SingletonInnerClass {
	
	private SingletonInnerClass() {}
	
	//1.INNER CLASS
	private static class SingletonHelper{
		//due to FINAL it will not re instantiate
		private static final SingletonInnerClass instance =new SingletonInnerClass();
	}
	//2. globally calling
	public static SingletonInnerClass getInstance() {
		return SingletonHelper.instance;
	}
	

}
