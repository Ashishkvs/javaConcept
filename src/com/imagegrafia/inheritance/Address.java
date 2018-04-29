package com.imagegrafia.inheritance;

public interface Address {

	String country="India";
	String state="";
	default String getVehicle() {return "Address";};
}
