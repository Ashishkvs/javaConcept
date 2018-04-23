package com.imagegrafia.howto;

public class ContinueUseCase {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 9, 45, 34, 10, 46 };

		for (int i : arr) {
			if (i % 2 != 0) // if it is true contiue don't go to next line
				continue;
			System.out.println(i); // for every flase statment it will print

			// for odd BUT int this way it will never execute this block
			if (i % 2 == 0)
				continue;
			System.out.println(i);

		}
		
		for(int k:arr) {
			if(k==45)  //till it find 45 it will print once it fint it will stop
				break;
			System.out.println(k);
		}
	}
}
