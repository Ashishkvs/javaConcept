package com.imagegrafia.garbagecollector;

/**
 * 
 * @author ashish
 *
 *Once we made object eligible for garbage collection, 
 *it may not destroy immediately by garbage collector.
 *But when JVM runs Garbage Collector, we can not expect.
 */
/**
 * 
 * @author ashish
 *There is no guarantee that any one of above two methods will definitely run Garbage Collector.
 *
 *Just before destroying an object, Garbage Collector calls finalize() method on the object to perform cleanup activities.
 * Once finalize() method completes, Garbage Collector destroys that object.
 * Based on our requirement, we can override finalize() method for perform our cleanup activities like closing connection from database.
 */
/**
 * 
 * @author ashish
 *
 *The finalize() method is never invoked more than once for any given object.
If an uncaught exception is thrown by the finalize() method, the exception is ignored and finalization of that object terminates.

 */
public class GarbageCollectorDemo2 {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called...");
		System.out.println("object collected for .."+ this);//to know which object has been destroyed
	}

	//
	public GarbageCollectorDemo2 gcd;
	
	public static void main(String[] args) {
		GarbageCollectorDemo2 g1=new GarbageCollectorDemo2();

		GarbageCollectorDemo2 g2=new GarbageCollectorDemo2();
		
		g1.gcd=g2;
		g2.gcd=g1;
		
		//making eligible for garbage collector
		g1.gcd=null;
		g2.gcd=null;
		// requesting JVM for running Garbage Collector
		System.gc();
		Runtime.getRuntime().gc();
	}

}
