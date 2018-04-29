package com.imagegrafia.thread;

class SynchronizedThreadProblem{

	public int count=0;
	
	public static void main(String[] args) {
		SynchronizedThreadProblem str=new SynchronizedThreadProblem();
		str.dowork();
		
	}
	public void dowork() {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					count++;
				}
				
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					count++;
				}
				
			}
		});
		t1.start(); //thread-1
		t2.start(); //thread -2
		System.out.println(count);//0 or any random no thread -main execution simultanously b4 completion t1 and t2 it executed i.e 0 initial value
		try {
			t1.join(); // here this will make main thread to wait till it complete
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.count);//some random no 12451 20000
		
	}

}
