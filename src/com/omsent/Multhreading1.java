package com.omsent;

public class Multhreading1 {

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
//		currentThread.setPriority(10);
		System.out.println("currentThread " + currentThread);
		
		new Multhreading1().testMultipleThread(); // this will start in new thread even before completing this below statement will be executed
		System.out.println("Thread started:::::::::::::::::::::::::");
	}
	
	
	//Dummy method will see it executing from multiple thread at same time
	void observeMultiThreading() {
		
		for(int i=0;i<50;i++) {
		
			try {
				System.out.println(Thread.currentThread()+" ->"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void testMultipleThread() {
		//1. override runnable interface run() method  and call the expected method into it.
		
		Runnable runnable = () -> observeMultiThreading();
		Thread t1 = new Thread(runnable);
		t1.setName("TD1");
		Thread t2 = new Thread(runnable);
		t2.setName("TD2");
		Thread t3 = new Thread(runnable);
		t3.setName("TD3");
		
		t1.start();
		t2.start();
		t3.start();
		
		//expected output occcur simultanously same for all thread
	}
}
