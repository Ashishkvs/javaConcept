package com.imagegrafia.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadCommute {

    static List<String> messages = new ArrayList<>();
    static String str = null;

    public static void main(String[] args) {

        Runnable listener = () -> {
            System.out.println("I am listening");

            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("Finding str" + str);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(listener, "Tesla");
//        t1.setDaemon(true);
        t1.start();


        Runnable broadcaster = () -> {
            System.out.println("I am broadcasting");
            for (int i = 0; i < 100; i++) {
                try {
                    str = "Ashish" + i;
                    System.out.println("Setting str" + str);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        Thread t2 = new Thread(broadcaster, "Bitcoin");
//        t2.setDaemon(true);
        t2.start();
    }
}
