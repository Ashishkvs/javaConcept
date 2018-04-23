package com.imagegrafia.Solution;

import java.util.Scanner;

public class PasswordStrength {
	
	public static void main(String[] args) {
		String password="ashishishZ1$";
		String msg="";
		
		if(password.length()<6) {
			msg="password must be > 6 letters";
		}
			System.out.println(msg);
		
			boolean hasNumber  = password.matches(".*\\d.*");  // "a digit with anything before or after"
			boolean hasSpecial = password.matches(".*[!#$*].*");
			boolean hasLowerCase = password.matches(".*[A-Z].*");
			boolean hasUpperCase=password.matches(".*[A-Z].*");
			System.out.println(hasNumber+":" +hasSpecial+":"+hasLowerCase+":"+hasUpperCase);
			
		
			
			
	}

}
