package com.imagegrafia.threaddeadlock;

public class CancelTicket extends Thread {
	Object train, comp;

	public CancelTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run() {
		synchronized (comp) {
			System.out.println("Cancel ticket Locked on compartment object");
			try {
				System.out.println("Cancel Ticket waiting to lock on train object....");
				Thread.sleep(200);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
				
			}
			synchronized (train) {
				System.out.println("Cancel ticket locked on Train object ");
				
			}
			
		}
	}

}
