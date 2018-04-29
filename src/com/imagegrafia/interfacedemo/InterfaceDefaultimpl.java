package com.imagegrafia.interfacedemo;

//1. how to call Default method of interface
/**
 * 
 * @author ashish
 * we can override default method in implementation class or we can NEGLECT override too
 */
//2. how to call static method of interface {to call static method need not to implements interface}
/**
 * 
 * @author ashish
 *we cannot override static method But we can neglect it 
 */
public class InterfaceDefaultimpl implements InterfaceDefaultDemo{
	
	//1.
	int x=InterfaceDefaultDemo.super.random();
	
	//2.
	double d=InterfaceDefaultDemo.intialAmount();
	public static void main(String[] args) {
		InterfaceDefaultimpl idi=new InterfaceDefaultimpl();
		System.out.println(idi.x);
		System.out.println(idi.d);
	}

}
