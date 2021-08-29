package com.imagegrafia.algorithms;

import java.util.stream.Stream;

public class NegativePoisitve2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, -2, 5, -3, 7, 10 };
		for (int i : shiftNegRight(arr)) {
			System.out.print(i + ",");
		}
	}

	// shift all neg to right
	public static int[] shiftNegRight(int arr[]) {

		int arrTemp[] = new int[arr.length];
		int startPointer = 0;
		int endPointer = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arrTemp[endPointer] = arr[i];
				endPointer--;
			} else {
				arrTemp[startPointer] = arr[i];
				startPointer++;
			}
//			printMe(arrTemp);
		}
		return arrTemp;
	}

	public static void printMe(int arr[]) {
//		System.out.println("Start Pointer:" + startPointer + ",endPointer:" + endPointer + "currentIndex" + i
//				+ ", currentValue:" + arr[i]);
		for (int i : arr) {
			System.out.println("printMe : " + i);
		}
	}
}
