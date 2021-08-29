package com.imagegrafia.basicjava;

public class StringBasic {

	public static void main(String[] args) {
		String path = "DDUUUDUU";
		int countD = 0;
		int countU = 0;

//		char[] charArray = path.toCharArray();
//		
//
//		for (int i = 0; i < charArray.length; i++) {
//			if (charArray[i] == 'D' || charArray[i] == 'd') {
//				countD++;
//			} else {
//				countU++;
//			}
//		}
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'D') {
				countD++;

			} else {
				countU++;
			}
		}
		System.out.println("Count D" + countD + " and countU" + countU);
		String s = "DDUUDUUDD";
		int level = 0;
		int valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
			} else if (s.charAt(i) == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		System.out.println("Valleys " + valleys);
//		return countU - countD;
	}
}
