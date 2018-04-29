package com.imagegrafia.thread;

import java.util.Scanner;

/**
 * 
 * @author ashish
 *	 here two threads are ecexuting same time 1 thread is writing hello another 
 *   is waiting to hit Enter so that it can execute next statement
 */
class Processor extends Thread {

	//volatile is used not to optimize the intializes values  by java/system 
	//hence there is a chance to alter the initial value of any var by another thread go for volatile 
	public volatile boolean running = true;  //in order to check every time this var use volatile

	@Override
	public void run() {

		while (running) {
			System.out.println("Hello");
		}
	}

	public void shutdown() {
		this.running = false;

	}

}

public class MyThreadShutdown {
	public static void main(String[] args) {
		Processor processor = new Processor();

		processor.start(); //Thread -1
		System.out.println("hit enter to stop running"); //thread 2 i.e main thread
		Scanner sc = new Scanner(System.in); 
		sc.nextLine(); // here thread 2 will wait till we hit enter

		processor.shutdown(); //once we hit enter it will execute and make thread running
								//condition false and terminate Thread-1
	}
}
