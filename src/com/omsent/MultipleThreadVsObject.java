package com.omsent;

public class MultipleThreadVsObject {

	
	int i =0;
	
	// two thread will be there 1 will update another will be notified
	
	

	//increase counter by 1 
	void jobDoneByThread1() {
		Runnable runnable = () -> i++;
		Thread t1 = new Thread(runnable);
		t1.start();
	}
	
	//read counter
	void jobDoneByThread2() {
		Runnable runnable = () -> System.out.print(i);;
		Thread t1 = new Thread(runnable);
		t1.start();
	}
	
	//case 1 We may get Expected Output
	void testThread1And2Case1() {
		jobDoneByThread1(); // i =1
		jobDoneByThread2(); //
	}
	
	//CASE2 we will not get expected output as both thead run seperately and simultaneously 
	void testThread1And2Case2() {
		for(int i=0;i<10;i++) {
			jobDoneByThread1(); // i =1
			jobDoneByThread2(); // // 1 3 3 4 5 6 7 8 9 1 0 so we can say its not thread safe program
		}
		
	}
	
	//Thread communication required for desired output once updated it will notify waiting thread
	void syncThread() {
		for(int i=0;i<10;i++) {
		Runnable update =() -> updateNumber();
		Thread t1 = new Thread(update);
		t1.start();
		
		Runnable read =() -> System.out.println(getUpdateNumber());
		Thread t2 = new Thread(read);
		t2.start();
		}
//		t2.wait(t1.notify());
	}
	
	synchronized void updateNumber() {
		this.i++;
//		this.notify();
	}
	synchronized int  getUpdateNumber() {
		return i;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Testing 2 thread");
//		new MultipleThreadVsObject().testThread1And2Case2();
		new MultipleThreadVsObject().syncThread();
	}
}
