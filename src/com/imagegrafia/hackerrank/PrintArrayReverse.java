package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class PrintArrayReverse {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        while(n>0) {
	        	--n;
	            System.out.print(arr[n]+" ");
	            
	        }
	        in.close();
	    }
	}


