package com.imagegrafia.thread;

class PrimeExample implements Runnable {

	long minPrime;

	PrimeExample(long minPrime) {
		this.minPrime = minPrime;
	}

	public void run() {
			System.out.println("Thread started");
		// compute primes larger than minPrime
		if (this.minPrime % 2 == 0) {
			this.minPrime = this.minPrime + 1;
		} else {
			this.minPrime = this.minPrime + 2;
		}
		System.out.println("Thread started"+this.minPrime);

	}

	public static void main(String[] args) throws InterruptedException {
//		Thread.dumpStack();
		System.out.println(Thread.activeCount());
		
		PrimeExample pe= new PrimeExample(143);
		Thread td = new Thread(pe);
//		td.start();
		td.checkAccess();
//		System.out.println();
		System.out.println(Thread.activeCount());
		Thread.sleep(5000);
		System.out.println(td.isAlive());
		td.run();
		td.getAllStackTraces();
		System.out.println(Thread.activeCount());
		
	}
}
