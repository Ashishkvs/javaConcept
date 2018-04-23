package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class OddEvenRange {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){ //if n i odd
	         ans = "Weird";
	      }
	      else if(n%2==0 && n>6 & n<=20) {  //if n is even and range 6 to 20
	    	  ans="Weird";
	      }
	      else if((n%2==0 && n>20)||(n%2==0 && n>2 & n<5)){
	         // Complete the code 
	    	  ans="Not Weird";
	      }
	     
	     
	      System.out.println(ans);
	   }
	}

