package com.imagegrafia.inheritance;
/**
 * 
 * @author ashish
 *Multiple inheritance is not supported by Java using classes ,
 * handling the complexity that causes due to multiple inheritance is very complex.
 *  It creates problem during various operations like casting,
 * constructor chaining etc and the above all reason is that 
 * there are very few scenarios on which we actually need multiple inheritance, 
 * so better to omit it for keeping the things simple and straightforward.
 */
public class StudentImpl implements Vehicle, Address, School{

	@Override
	public String getSchoolDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVehicle() {
		System.out.println(Vehicle.super.getVehicle());
		return "StudentImpl";
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new StudentImpl();
		
		System.out.println(vehicle.getVehicle());
		
	}


}
