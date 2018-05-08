package com.example.demo;

public class ElementShiftNearestGreatest {
	public static void main(String[] args) {
		Integer a[] = { 10, 8, 13, 16, 15, 9, 14, 11 };

		for (int i = 0; i < a.length; i++) {
			int j=i+1;
			while (j < a.length) {
				if (a[i] < a[j]) {
					a[i]=a[j];
					break;//in order to stop on 1st occurence we need break
				}
				j++;
			}
		}

		for (Integer k : a) {
			System.out.println(k);
		}
	}

}
