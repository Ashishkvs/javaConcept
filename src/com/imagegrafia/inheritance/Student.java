package com.imagegrafia.inheritance;

/**
 * 
 * @author ashish
 *Multiple inheritance
 */
public interface Student extends Address,School,Vehicle {

	@Override
	default String getVehicle() {
		// TODO Auto-generated method stub
		return Address.super.getVehicle();
	}

}
