package com.imagegrafia.commons;

public class ReverseString {
	
	public static void main(String[] args) {
		String name="Ashish Kumar";
		
	/*	//PRINT EACH CHAR OF A STRING IN GIVEN ORDER
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		//PRINT EACH CHAR IN REVERSE ORDER using for Loop
		System.out.println("\n Break");
		for(int j=name.length()-1;j>-1;j--) {
			System.out.print(name.charAt(j));
		}
		*/
		//Another Method
		char arr[]=name.toCharArray();
		//System.out.println(arr.length);
		int size=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
		char temp=arr[i];
		arr[i]=arr[size-i];
		arr[size-i]=temp;
		System.out.println(arr);
		}
		
	}

}
