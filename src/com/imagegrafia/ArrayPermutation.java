package com.imagegrafia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayPermutation {
	String msg = "abc";
	Map<String, Integer[]> map = new HashMap<>();
	Integer a[] = { 1, 2, 3 };
	Integer b[] = { 4, 5, 6 };
	Integer c[] = { 7, 8, 9 };
	Integer d[] = { 4, 7, 1 };
	Integer e[] = { 1, 2, 3 };
	Integer f[] = { 4, 5, 6 };
	Integer g[] = { 7, 8, 9 };
	Integer h[] = { 4, 7, 1 };

	public ArrayPermutation() {

		map.put("a", a);
		map.put("b", b);
		map.put("c", c);
		map.put("d", d);
		map.put("e", e);
		map.put("f", f);
		map.put("g", g);
		map.put("g", h);
	}

	// list to be add upcoming array
	List<Integer[]> list = new ArrayList<>();

	// add the object if it exist
	public void addArrays(String arr) {
		if (map.containsKey(arr)) {
			list.add(map.get(arr));
		}
	}

	// split string and call addArrays method to get new combination
	public void checkString(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			String temp = "" + msg.charAt(i);
			addArrays(temp);
		}
	}

	// permutation of array into list a[],b[],c[]
	public void computePermutation(List<Integer[]> list) {
		Integer a[] = list.get(0); // array 1
		Integer b[] = list.get(1); // array 2
		Integer c[] = list.get(2); // array 3

		for (int i = 0; i < a.length; i++) {
			// 1st loop
			for (int j = 0; j < b.length; j++) {
				// 2nd loop

				for (int k = 0; k < c.length; k++) {
					// 3r loop
					System.out.println(a[i] + "," + b[j] + "," + c[k]);

				}

			}

		}

	}

	// method to call
	public void splitString(String msg) {
		// checkstring()
		checkString(msg);
		// breakListArrays()
		computePermutation(list);

	}

	public static void main(String[] args) {
		ArrayPermutation ap = new ArrayPermutation();
		ap.splitString("bde");

	}

}
