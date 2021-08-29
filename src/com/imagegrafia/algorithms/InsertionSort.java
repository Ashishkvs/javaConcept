package com.imagegrafia.algorithms;

public class InsertionSort {
	public static void main(String[] args) {
//		Integer arr1[]= new Integer[] {};
//		int x[] = new int[0];
		System.out.println("Insertion Sort");
		Integer arr[] = new Integer[] { 2, 4, -1, 20, 12, 24, 7 };
		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x+" ,");
		}

	}

}
