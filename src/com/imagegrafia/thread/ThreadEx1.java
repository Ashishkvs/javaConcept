package com.imagegrafia.thread;

public class ThreadEx1 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread from Runnable interface");
	}

	public static void main(String[] args) {
		ThreadEx1 thex = new ThreadEx1();
		Thread td = new Thread(thex);
		td.start();
		
		Thread th= new Thread();
		th.start();
	}
}
