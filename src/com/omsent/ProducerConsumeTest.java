package com.omsent;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumeTest {

	int i = 0;
	List<Integer> list = new ArrayList<>();

	public void producer() {
		synchronized (this) {

			try {

				Thread.sleep(1000);
				list.add(i++);
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("producing list" + i);
		}
	}

	public void consumer() {
		synchronized (this) {
			while (list.size() == 0)
				try {
					System.out.println("Waiting for thread notification");
					wait(); // suspend thread until notify
					System.out.println("Consuming list" + list.size());
					list.remove(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

	void testPorducerConsumer() {

		Thread producerThread = new Thread(() -> producer());
		Thread consumerThread = new Thread(() -> consumer());
		producerThread.start();
		consumerThread.start();

//		for (int i = 0; i < 10; i++) {
//
//		}
	}

	public static void main(String[] args) {
//		new ProducerConsumeTest().testCase1(); // run with no error 
//		new ProducerConsumeTest().testCase2(); // Index out of bound
//		new ProducerConsumeTest().testCase3(); // multithreading  will fail
//		new ProducerConsumeTest().testCase4();

		new ProducerConsumeTest().testPorducerConsumer();
	}

	// for same thread
	void testCase1() {
		for (int i = 0; i < 10; i++) {
			producer();
			consumer();

		}
	}

	void testCase2() {
		for (int i = 0; i < 10; i++) {
			consumer();
			producer();

		}
	}

	void testCase3() {
		Runnable producer = () -> new ProducerConsumeTest().producer();
		Runnable consumer = () -> new ProducerConsumeTest().consumer();
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);

		t1.start();
		t2.start();
	}

	void testCase4() {
		Runnable producer = () -> new ProducerConsumeTest().producer();
		Runnable consumer = () -> new ProducerConsumeTest().consumer();
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);

//		synchronized(this) {
//			t1.start();
//			t1.notifyAll();
//			
//		}
//		t2.start();

//		t1.wait();
		t2.start();
		t1.start();
//		
//		

	}
}
