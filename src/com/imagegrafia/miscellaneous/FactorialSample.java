package com.imagegrafia.miscellaneous;

public class FactorialSample {
    public static void main(String[] args) {

        System.out.println(findFactorial(10)); // 10*9*8*7*6
//        findFactorial(5); // 5*4*3*2*1
        System.out.println(findFactorialWithRecursion(10));
    }

    static int findFactorial(int n) {
        int temp = 1;
        if(n==1) {
            return temp;
        }
        while(n != 1) {
            temp = temp*n;
            n--;
        }
        return temp;
    }
    static int findFactorialWithRecursion(int n){

        if(n==1) {
            return 1;
        }
        return n* findFactorialWithRecursion(n-1);
    }
}
