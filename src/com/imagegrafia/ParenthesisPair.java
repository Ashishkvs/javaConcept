package com.example.demo;
/*
 * Find out the parenthesis pair of string 
 * 
 * print the smallest parenthesis that pair can be formed
 * */

public class ParenthesisPair {
	static String str="()())(()(()";
	
	public static void main(String[] args) {
		int left=0,right=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' ) {
				left++;
			}else if(str.charAt(i)==')' ) {
				right++;
			}
			
		}
		System.out.println(left+":"+right);
		//is left <right if yes print left other wise right
		int x = (left<right) ? left : right;
		System.out.println(x);
		
	}
	

}
