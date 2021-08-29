package com.imagegrafia.algorithms;

public class DynamicArray {
	static int arr[] = new int[10];
	static Integer arrObj[] = new Integer[10];

	public static void main(String[] args) {
		System.out.println(arr.length);
//		for (int i = 0; i < 3; i++) {
//			arr = new int[(int) (arr.length * 1.75)];
//			System.out.println(arr.length);
//		}
//		addElement(arr, 0);
		addElementArrayObj(arrObj, 0);
	}

	public static void addElement(int arr[], int element) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
//			if(arr[i] == 0) {
//				
//			}
		}
	}
	public static void addElementArrayObj(Integer arr[], int element) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i] == null) {
				arr[i] = element;
				return;
			}
		}
	}

}
