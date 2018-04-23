package com.imagegrafia.exception;

/**
 * 
 * @author ashish
 * Exception is checked exception 
 * Checked exception Compulsary need to handle before compiling
 * either using Throws keyword || using try catch block 
 */

public class CreateCheckedException extends Exception {

	String msg="";
	public CreateCheckedException(String msg) {
		// TODO Auto-generated constructor stub
		System.err.println(msg);
	}
}
