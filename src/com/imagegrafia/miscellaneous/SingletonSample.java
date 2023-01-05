package com.imagegrafia.miscellaneous;

public class SingletonSample {


    public static void main(String[] args) {
        System.out.println("Checking singleton instance");
//        SingletonTest singletonTest1 = new SingletonTest(); // due to private constructor

//        for (int i = 0; i < 500; i++) {
//            SingletonTest singletonTest = SingletonTest.getSingletonSample();
//        }

        // break singleton
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread());
            SingletonTest.getSingletonSample();
        };

        Thread t1 = new Thread(runnable, "Tesla");
        Thread t2 = new Thread(runnable, "Doze");
        Thread t3 = new Thread(runnable, "Bitcoin");
        t1.start();
        t2.start();
        t3.start();

        for(int i =0; i<100;i++) {
            Thread t = new Thread(runnable, "Tesla"+i);
            t.start();
        }


    }
}

class SingletonTest {

    private static int count = 0;
    private static SingletonTest singletonTest = null;

    private SingletonTest() {
        count++;
        System.out.println("I have been called " + count + "times");
    }

    public static SingletonTest getSingletonSample() {

        if (singletonTest == null) {
            synchronized (SingletonTest.class) {
                if (singletonTest == null) {
                    singletonTest = new SingletonTest();
                }
            }
        }

        return singletonTest;
    }
}
