package com.imagegrafia.garbagecollector;
/**
 * 
 * @author ashish
 *Garbage collector is best example of Daemon thread as it is always running in background.
 *Main objective of Garbage Collector is to free heap memory by destroying unreachable objects.
 *
 *Unreachable objects : An object is said to be unreachable iff it doesn’t contain any reference to it. 
 *Also note that objects which are part of island of isolation are also unreachable.
 *
 *Eligibility for garbage collection : An object is said to be eligible for GC(garbage collection) iff it is unreachable.  
 *after i = null; 
 *integer object 4 in heap area is eligible for garbage collection.
 *
 *Even though programmer is not responsible to destroy useless objects but it is highly recommended to make an object unreachable(thus eligible for GC) if it is no longer required.
There are generally four different ways to make an object eligible for garbage collection.
Nullifying the reference variable
Re-assigning the reference variable
Object created inside method
Island of Isolation
 */
public class GarbageCollectorDemo {
	//1. Before System.gc() method compulsary finalize() method has to be called
	@Override
	protected void finalize() throws Throwable {
		//to check whether gc() method called or not override this method with msg
		System.out.println("finalize method called...it means System.gc() is for sure called");
	}
	
	public static void main(String[] args) {
		Integer i = new Integer(4);
		// the new Integer object is reachable  via the reference in 'i' 
		i = null;
		// the Integer object is no longer reachable. 
		
		
		
		/**
		 * call garbage collector from System class
		 * if gc() will called... for sure finalize() method called before it
		 *  if not it means gc() has not been called yet
		 */
		System.gc();
		
	}

	
	
}
