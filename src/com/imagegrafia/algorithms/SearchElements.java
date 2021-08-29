package com.imagegrafia.algorithms;

public class SearchElements {

	//Linear Search
	public static void main(String[] args) {
		int arr[] = { 6, 18, 5, 9, 15, 6, 2, 7, 9, 3, 6 };
		System.out.println(searchElement(arr, 9));
		System.out.println(searchElementPosition(arr, 7));
		System.out.println(searchElementOccurence(arr, 6));
	}

	public static boolean searchElement(int arr[], int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search)
				return true;
		}
		return false;
	}

	public static int searchElementPosition(int arr[], int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search)
				return i;
		}
		return -1;
	}

	public static int searchElementOccurence(int arr[], int search) {
		int occurence = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search)
				occurence++;
		}
		return occurence;
	}
}
