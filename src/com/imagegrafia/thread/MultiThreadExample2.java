package com.imagegrafia.thread;

import java.util.Date;

public class MultiThreadExample2 extends Thread{

	@Override
	public void run() {
		MultiThreadExample2 mte = new MultiThreadExample2();
		try {
			mte.method1("method1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		MultiThreadExample2 mte = new MultiThreadExample2();
		mte.start();
		MultiThreadExample2 mte2 = new MultiThreadExample2();
		mte2.start();
		MultiThreadExample2 mte3 = new MultiThreadExample2();
		mte3.start();
		
		
	}

	void method1(String name) throws InterruptedException {
		System.out.println(name + " started at " + new Date());
		Thread.sleep(10000);
		System.out.println(name + " ended at " + new Date());
	}
}
