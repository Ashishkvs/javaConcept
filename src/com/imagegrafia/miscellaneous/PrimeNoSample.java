package com.imagegrafia.miscellaneous;

public class PrimeNoSample {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            checkNoIsPrime(i);
        }

    }

    // 2 , 3, 7, 11,13 no divisible by 1 nad itself
    static void checkNoIsPrime(int n) {

        if(n==1 || n==0) {
            System.out.println("Not a prime no");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
//                System.out.println(n + "is not prime number");
                return;
            }
        }
        System.out.println(n + "is prime no");

    }
}
