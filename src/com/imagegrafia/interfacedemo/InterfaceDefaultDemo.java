package com.imagegrafia.interfacedemo;

import java.util.Random;

public interface InterfaceDefaultDemo {
	//default method
	default int random() {
		Random random =new Random();
		
		return random.nextInt(100); //bound random no upto 100 only
	}
	//static method
	public static double intialAmount() {
		
		return 1.0000d;
	}

}
