package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class StringCombination {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String odd="";
		String even="";
		int noOfTestCase=scan.nextInt();
		String []arr=new String[noOfTestCase];
		for(int i=0;i<noOfTestCase;i++) {
			arr[i]=scan.next();
			
		}
		for(String str:arr) {
			for(int i=0;i<str.length();i++) {
				if(i%2==0) {
					even+=str.charAt(i);
				}else {
					odd+=str.charAt(i);
				}
			}
			System.out.println(even+" "+odd);
			even=odd="";
		}
	}
}
