package com.imagegrafia.singleton;

//? why we should avoid such instantiation

/**
 * 
 * @author ashish
 *
 *         if your singleton class is not using a lot of resources, this is the
 *         approach to use. But in most of the scenarios, Singleton classes are
 *         created for resources such as File System, Database connections etc
 *         and we should avoid the instantiation until unless client calls the
 *         getInstance method. Also this method doesn’t provide any options for
 *         exception handling.
 */
public class SingletonFinal {
	private SingletonFinal() {
	}

	private static SingletonFinal sf = new SingletonFinal();

	public static SingletonFinal getInstance() {
		return sf;
	}

}
