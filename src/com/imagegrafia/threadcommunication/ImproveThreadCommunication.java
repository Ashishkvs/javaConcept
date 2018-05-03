package com.imagegrafia.threadcommunication;

/**
 * 
 * @author ashish
 *
 *         Thread communication can be improved by using obj.notify()
 *         notifyAll() & wait()
 *
 *         it is recommended to use above method inside synchronized block
 */


// PRODUCER
class Production extends Thread {
	public StringBuffer sb;

	public Production() {
		sb = new StringBuffer(" ");
	}

	public void run() {
		synchronized (sb) {
			try {
			for (int i = 0; i < 10; i++) {
				
				sb.append(i + " : ");
				Thread.sleep(10);
				System.out.println("Producing...");
				}
				
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			sb.notify();
		}
		
	}
}
//CONSUMER
class Consumption extends Thread {

	public volatile Production production;

	public Consumption(Production production) {
		this.production = production;

	}

	public void run() {
		System.out.println("Run ()  from consumer");
		synchronized (production.sb) {
			//wait till a notification is received
			try {
				production.sb.wait();
				System.out.println("Production is over..");
				System.out.println(production.sb);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			
		}
			
	}
}


//1. immediately send a notification once production is over no need to wait
public class ImproveThreadCommunication {

	public static void main(String[] args) {
		Production prod=new Production();
		Consumption consumption=new Consumption(prod);
		
		Thread t1=new Thread(prod);
		t1.setPriority(10);
		Thread t2=new Thread(consumption);
		t2.setPriority(10);
		
		t2.start();
		t1.start();
	}
}
