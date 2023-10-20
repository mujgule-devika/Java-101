package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P4 {
	public static void main(String[] args){
		// TODO: write your code here
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        int count = 0;
	        for (int i = 0; i < inputStr.length(); i++) {
	            if (Character.isUpperCase(inputStr.charAt(i))) {
	                count++;
	            }
	        }
	        System.out.println("The number of uppercase letters is " + count);
	    
	}
}
