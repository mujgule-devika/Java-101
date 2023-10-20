package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P1 {
	public static void main(String[] args){
		// TODO: write your code here
		Scanner input = new Scanner (System.in);
		System.out.print("Enter amount of water in Kilograms: ");
		double kg = input.nextDouble();

		System.out.print("Enter initial temprature: ");
		double initialTemp = input.nextDouble();

		System.out.print("Enter final temprature: ");
		double finalTemp = input.nextDouble();
		
		double enerygNeeded = kg * (finalTemp - initialTemp) * 4184;


		System.out.print("Energy needed is " + enerygNeeded);
	}
}
