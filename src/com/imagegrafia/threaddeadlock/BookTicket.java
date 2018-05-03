package com.imagegrafia.threaddeadlock;

public class BookTicket extends Thread {
	Object train,comp;

	
	public BookTicket(Object train,Object comp) {
		this.train=train;
		this.comp=comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("Book ticket locked on train object");
			try {
				System.out.println("Book ticket waiting to lock compartment object....");
				Thread.sleep(150);//make it sleep so that till then comp obj will locked
				
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			synchronized (comp) {
				System.out.println("Book Ticked locked on compartment object");
			}
		}
	}

}
