package com.imagegrafia.commons;

import java.util.Scanner;

public class StairCase {
	/*
	     * Complete the staircase function below.
	     */
	    static void staircase(int n) {
	        /*
	         * Write your code here.
	         */
	        int j=1;
	        while(j<=n){
	            for(int k=n-j;k>0;k--){
	                 System.out.print(" ");
	            }
	        for(int i=1;i<=j;i++){
	            System.out.print("#");
	           
	        }
	            System.out.println(" ");
	             j++;
	        }
	        

	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine().trim());

	        staircase(n);
	    }
	}


