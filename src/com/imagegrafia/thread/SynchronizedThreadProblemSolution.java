package com.imagegrafia.thread;

public class SynchronizedThreadProblemSolution {
	int count = 0;

	public synchronized void increment() { 
		// After synchronized result will constant
		count++;
	}
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
						increment();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();

			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		SynchronizedThreadProblemSolution stps = new SynchronizedThreadProblemSolution();
		stps.doWork();
	}

}
