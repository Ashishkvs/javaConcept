package com.omsent;

public class TestForLoop {
	
	
	
	
	
	public static void main(String[] args) {
	

		//Valid code but bleow code will run infinite and vice versa 1st loop throw compile erro as unreachable code
		
		for(int i =0;i<100;) {
			System.out.println(i++);
		}
		for(;;) {
//			infinte loop
		}
	}
	
	

}
