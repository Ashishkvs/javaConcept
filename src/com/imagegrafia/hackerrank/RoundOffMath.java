package com.imagegrafia.hackerrank;

import java.util.Scanner;

public class RoundOffMath {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double meal_cost = in.nextDouble();
	        int tip_percent = in.nextInt();
	        int tax_percent = in.nextInt();
	        double tip=meal_cost*tip_percent/100;
	        double tax=meal_cost*tax_percent/100;
	        double totalMealCost=meal_cost+tip+tax;
	        //if we take int it will give possible conversion loss error
	        long roundOff=Math.round(totalMealCost);
	        System.out.println("The total meal cost is "+roundOff+" dollars.");
	        in.close();
}
	 }
