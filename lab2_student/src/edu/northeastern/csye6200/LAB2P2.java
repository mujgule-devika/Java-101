package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P2 {
	public static void main(String[] args){
		// TODO: write your code here
		Scanner input = new Scanner (System.in);
		System.out.print("Enter package weight: ");
		double weight = input.nextDouble();
		
		System.out.print(packageCost(weight));		
	}
	
	public static String packageCost (double weight) {
		String c0 = "The shipping cost is ", c1 = "$3.5", c2 = "$5.5", c3 ="$8.5", c4 ="$10.5", c5 = "The package connot be shipped"; 
		
		if (weight > 0 && weight <= 1 ) {
			return c0 + c1;
		} else if (weight > 1 && weight <= 3) {
			return c0 + c2;
		} else if ( weight > 3 && weight <= 10) {
			return c0 + c3;
		} else if (weight > 10 && weight <= 20) {
			return c0 + c4;
			
		} else {
			return c5;
		}
	}
}
