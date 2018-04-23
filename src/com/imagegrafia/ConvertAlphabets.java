package com.imagegrafia;

/**
 * convert all to Lower
 * filter all Upper (65 to 91) and lower Case (97 to 122) alphabet in a String
 * @author Ashish
 *
 */
public class ConvertAlphabets {
	public static void main(String[] args) {
		String name = "AshIsh Kumar";
		//String name="AsHi 12Kumar";
		
		//filter all Upper
		String upperCase = "";
		for (int i = 0; i < name.length(); i++) {
			int x = name.charAt(i);
			if (x >= 65 & x <= 91) {
				upperCase+=name.charAt(i);
			}
		}
		System.out.println(upperCase);
		
		//filter all Lower
		String lowerCase="";
		for(int k=0;k<name.length();k++) {
			int y=name.charAt(k);
			if(y>=97 & y<=122) {
				lowerCase+=name.charAt(k);
			}
		}
		System.out.println(lowerCase);
		//CONVERT Into LowerCaps
		String smallCaps="";
		for(int j=0;j<name.length();j++) {
			int y=name.charAt(j);
			if(y>=65 & y<=91) {
				int newChar=97+(y-65);
				char ch=(char) newChar;
				smallCaps+=ch;
			}else
			smallCaps+=name.charAt(j);
		}
		System.out.println(smallCaps);
		
		//CONVERT Into UpperCaps

	}
	

}
