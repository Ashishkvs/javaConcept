package com.imagegrafia.thread;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class MultiThreadExample3 {
	public static void main(String[] args) throws InterruptedException {
			CompletionStage<Void> cf = new CompletableFuture<Void>().runAsync(()-> System.out.println("Runing assync"));
			cf.thenRun(()-> System.out.println("Runing assync"));
			cf.thenRunAsync(()->  System.out.println("Runing assync again"));
//			CompletableFuture<String> cbf= ((CompletableFuture<String>)cf).join();
	}

	void method1(String name) throws InterruptedException {
		System.out.println(name + " started at " + new Date());
		Thread.sleep(10000);
		System.out.println(name + " ended at " + new Date());
	}
}
