package com.imagegrafia;

public class SumOfIndexesAlternative {
	
	public static void main(String[] args) {
		String no="100010101010101";
		int size=0;
		//total no of 1's in string cal it as array new size
		for(int p=0;p<no.length();p++) {
			if(no.charAt(p)=='1')
					size++;
		}
		//create new array and store indexes  of 1's into it
		int arr[]=new int[size];//7
		int index=0;
		for(int i=0;i<no.length();i++) {
			if(no.charAt(i)=='1') {
				arr[index]=i;
				index++;
			}
			
		}
		//Print array of newly Stored indexes
		for(int k=0;k<arr.length;k++)
		System.out.println(arr[k]);
		
	}
	

}
