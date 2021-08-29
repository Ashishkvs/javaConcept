package com.imagegrafia.algorithms;

import java.util.stream.Stream;

public class NegativePoisitve {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, -2, 5, -3, 7, 10 };
		for (int i : shiftNegRight(arr)) {
			System.out.print(i + ",");
		}
	}
	//10,7,5,1,-2,-3,

	// shift all neg to right
	public static int[] shiftNegRight(int arr[]) {
		int xCount=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
				}
				xCount++;
			}
		}
		System.out.println(xCount);
		
		return arr;
	}

	public static void printMe(int arr[]) {
		for (int i : arr) {
			System.out.println("printMe : " + i);
		}
	}
}
