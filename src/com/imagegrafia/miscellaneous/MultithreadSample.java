package com.imagegrafia.miscellaneous;

import java.util.Arrays;
import java.util.List;

public class MultithreadSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Runnable runnable = () -> {
//            list.forEach(System.out::println); // will not work as Thread .sleep need to inside for loop
            try {
                for (Integer i : list) {
                    System.out.println("Thread name " + Thread.currentThread() + i);
                    if (Thread.currentThread().getName().equalsIgnoreCase("Tesla") && i == 2) {
                        throw new RuntimeException("Thrown from " + Thread.currentThread());
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t1 = new Thread(runnable, "Tesla");
        Thread t2 = new Thread(runnable, "Doge");
        Thread t3 = new Thread(runnable, "Bitcoin");
        t1.start();
        t2.start();
        t3.start();

    }
}
