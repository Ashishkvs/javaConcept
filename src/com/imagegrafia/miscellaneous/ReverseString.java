package com.imagegrafia.miscellaneous;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ashish Kumar";
        reverString(str);

        reverseStringUsingChar(str);

    }

    static void reverString(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - 1 - i));
        }
        System.out.println(sb.toString());
    }

    static void reverseStringUsingChar(String str) {
        char arr[] = str.toCharArray();
        char arrTemp[] = new char[str.length()];
//        for (int i = arr.length-1; i > 0; i--) {
        for (int i = 0; i < arr.length; i++) {
            arrTemp[arr.length-1-i] = arr[i];
        }
        System.out.println(arrTemp);
    }
}
