package com.imagegrafia.threadcommunication;

//************************PRODUCER CLASS *****************
class Producer extends Thread {

	public StringBuffer sb;
	public boolean prodOver=false;

	public Producer() {
		sb = new StringBuffer();
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				sb = sb.append(i + ":");
				Thread.sleep(10);
				System.out.println("Producing...");
			}
			// once appending is done set prodOver to true
			prodOver = true;

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

// ************************CONUMER CLASS *****************
class Consumer extends Thread {

	public Producer producer;

	public Consumer(Producer producer) {
		this.producer = producer;

	}

	public void run() {
		try {
			// check prod is done or not on evry 100th second
			while (!producer.prodOver) {
				System.out.println("Checking prod is not over so sleep..");
				Thread.sleep(100);
			}

			System.out.println("prod is done");
			System.out.println(producer.sb);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}

public class ThreadCommunicationDemo {
	public static void main(String[] args) {

		// start producing
		Producer producer = new Producer();

		// check producing is done or not on producer object after completing Producer run method cnditon will true and checking will stop
		Consumer consumer = new Consumer(producer);
		Thread c1 = new Thread(consumer);
		Thread p1 = new Thread(producer);
		p1.start();
		c1.start();
	}
}
