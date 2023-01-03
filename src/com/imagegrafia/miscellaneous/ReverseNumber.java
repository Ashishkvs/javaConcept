package com.imagegrafia.miscellaneous;

public class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber(84512);
      reverseNumberUsingString(84512);
    }

    static void reverseNumber(int num) {
//        int num = 1234;
        int reverseNum = 0;
        while (num != 0) {
            int currentNum = num % 10;
//            System.out.println(currentNum);
            num = num / 10;
            //reverse no
            reverseNum = reverseNum * 10 + currentNum; //4 // 4*10+3 // 43*10+2 // 432*10+1// 4321
        }
        System.out.println(reverseNum);
    }

    static void reverseNumberUsingString(int number) {
        String str = String.valueOf(number);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++) {
            sb.append(str.charAt(str.length()-1-i));
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }

}
