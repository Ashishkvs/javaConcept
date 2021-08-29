package com.imagegrafia.algorithms;

public class MinMaxAndSort {
	public static void main(String[] args) {

		int arr[] = { 18, 5, 9, 15, 6, 2, 7, 9, 3, 6 };
		System.out.println(max(arr));
		System.out.println(min(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("----------------");
		int sortedArr[] = sort(arr);

		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
	}

	public static int max(int arr[]) {
		System.out.println("=============Finding max==============");
		int maxElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}

		}
		return maxElement;
	}

	public static int min(int arr[]) {
		System.out.println("=============Finding min==============");
		int minElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minElement) {
				minElement = arr[i];
			}

		}
		return minElement;
	}

	//n*n times complexity
	public static int[] sort(int arr[]) {
		System.out.println("=============sorting elements==============");
		int times = 0;
		while (arr.length > times) {
			for (int i = 0; i < arr.length; i++) {
//			System.out.println(i);
				if ((arr.length > i + 1) && (arr[i] > arr[i + 1])) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
			times++;
		}
		return arr;
	}
}
