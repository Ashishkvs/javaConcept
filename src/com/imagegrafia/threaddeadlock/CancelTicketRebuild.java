package com.imagegrafia.threaddeadlock;

//1. follow the same (BookTicket) pattern to lock Cancel ticket object
//2. if we lock alternate train then comp && comp then train it will cause dead lock
public class CancelTicketRebuild  extends Thread{

	Object train, comp;

	public CancelTicketRebuild(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run() {
		//1.
		synchronized (train) {
			System.out.println("Cancel ticket Locked on Train object");
			try {
				System.out.println("Cancel Ticket waiting to lock on comp object....");
				Thread.sleep(200);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
				
			}
			synchronized (comp) {
				System.out.println("Cancel ticket locked on comp object ");
				
			}
			
		}
	}

}
