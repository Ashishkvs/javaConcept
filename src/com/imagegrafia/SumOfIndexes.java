package com.imagegrafia;

import java.util.ArrayList;

/**
 * find index of all 1's and sum of all indexes
 */

public class SumOfIndexes {
	public static void main(String[] args) {

		String no = "100001001001001010";
			int size=1;
		int sumOfIndexes = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < no.length(); i++) {
			if(no.charAt(i)=='1'){
				size++;
			}
			
			if (no.charAt(i) == '1') {
				arr.add(i);
				
				sumOfIndexes += i;
			}

		}
		System.out.println(arr + ":" + sumOfIndexes);
		
		/** 
		 * if you want string 
		 * String str="";
		str+=i;
		System.out.println(str);
		 */

	}

}
