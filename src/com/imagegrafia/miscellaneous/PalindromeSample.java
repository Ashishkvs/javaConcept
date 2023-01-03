package com.imagegrafia.miscellaneous;

public class PalindromeSample {

    public static void main(String[] args) {

        checkNoIsPalindrome(1221);
        checkNoIsPalindrome(1111);
    }

    static boolean checkNoIsPalindrome(int n) {

        if(n == reverseNumber(n)) {
            System.out.println(n+" is palindrome");
            return true;
        } else {
            System.out.println(n+" Not a plindrome");
        }

        return false;
    }

    static int reverseNumber(int n) {
        int tmpNo = 0;
        while (n != 0) {
            int tmp = n % 10;
            tmpNo = tmpNo * 10 + tmp;
            n = n / 10;
        }
        return tmpNo;
    }
}
