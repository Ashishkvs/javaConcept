package com.imagegrafia.thread;

import java.util.Date;

public class MultiThreadExample implements Runnable{

	String name;
	MultiThreadExample(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		try {
			method1(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		MultiThreadExample mte = new MultiThreadExample("Method1");
		Thread td = new Thread(mte);
		td.start();
		Thread td1 = new Thread(mte);
		td1.start();
		Thread td2 = new Thread(mte);
		td2.start();
		
	}

	void method1(String name) throws InterruptedException {
		System.out.println(name + " started at " + new Date());
		Thread.sleep(10000);
		System.out.println(name + " ended at " + new Date());
	}
}
