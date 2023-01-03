package com.imagegrafia.miscellaneous;

public class ReverseArrayElement {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        arr = reverseArray(new int[]{1,2,3,7,9,10});
        for (int i : arr) {
            System.out.print(i+"\t ,");
        }
    }
    static int[] reverseArray(int arr[]) {
        int arrTemp[] = new int[arr.length];
        for(int i =0;i<arr.length;i++) {
            arrTemp[i]=arr[arr.length-1-i];
        }
        return arrTemp;
    }
}
