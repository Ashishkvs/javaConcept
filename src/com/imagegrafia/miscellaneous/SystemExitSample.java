package com.imagegrafia.miscellaneous;

public class SystemExitSample {
    public static void main(String[] args) {
        SystemExitSample systemExitSample = new SystemExitSample();
//        systemExitSample.testFinallyBlockWithSystemExit(0); // finally will execute if exception occur
//        systemExitSample.testFinallyBlockWithSystemExit(1); // finally will not execute
        System.out.println(systemExitSample.testFinallyWithReturn(0));
        System.out.println(systemExitSample.testFinallyWithReturn(1)); // finally will overtake precedence

    }

    void testFinallyBlockWithSystemExit(int i) {
        System.out.println("Started testFinallyBlockWithSystemExit ...");
        try {
            if (i == 0)
                throw new RuntimeException("Exception thrown");
            System.exit(0);
            //if try block executed without exception then finally will not execute due to system exit

        } catch (Exception exception) {
            System.out.println("Exception thrown");
        } finally {
            System.out.println("Finally Executed due to exception");
        }
    }

    int testFinallyWithReturn(int i) {
        System.out.println("Started testFinallyWithReturn ...");
        try {
            if (i == 0)
                throw new RuntimeException("Exception thrown");

        } catch (Exception exception) {
            System.out.println("Exception thrown");
            return 100; // if finally not present then catch return will work
        }
        finally {
            System.out.println("Finally Executed ");
            return 2000; // this works same and method return statement if we declare here below return will throw compile error
        }

//        return 5000; // as finally have return so this will be unreacheable
    }
}
