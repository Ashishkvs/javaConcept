package com.imagegrafia.threaddeadlock;

//1. follow the same (BookTicket) pattern to lock Cancel ticket object
//2. if we lock alternate train then comp && comp then train it will cause dead lock
public class ThreadDeadlock {
	public static void main(String[] args) {
		Object train =new Object();
		Object comp=new Object();
		
		BookTicket bookTicket=new BookTicket(train, comp);
		CancelTicket cancelTicket=new CancelTicket(train, comp);
		
		//CAUSE DEADLOCK
		/*Thread t1=new Thread(bookTicket);
		Thread t2=new Thread(cancelTicket);
		
		t1.start();
		t2.start();
		*/
		
		//OVERCOME Deadlock
		
		CancelTicketRebuild cancelTicketRebuild=new CancelTicketRebuild(train, comp);
		Thread t3=new Thread(bookTicket);
		Thread t4=new Thread(cancelTicketRebuild);
		
		t3.start();
		t4.start();
	}

}
