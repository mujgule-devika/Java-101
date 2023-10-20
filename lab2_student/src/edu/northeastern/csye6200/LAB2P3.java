package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P3 {
	public static void main(String[] args){
		// TODO: write your code here
		
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the year: ");
	        int year = scanner.nextInt();
	        System.out.print("Enter the month: ");
	        String month = scanner.next();
	        
	        int daysInMonth = 0;
	        switch (month) {
	        case "Jan":
	        case "Mar":
	        case "May":
	        case "Jul":
	        case "Aug":
	        case "Oct":
	        case "Dec":
	            daysInMonth = 31;
	            break;
	        case "Feb":
	            daysInMonth = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
	            break;
	        case "Apr":
	        case "Jun":
	        case "Sep":
	        case "Nov":
	            daysInMonth = 30;
	            break;
	        default:
	            System.out.println("Invalid month name.");
	    }

	        System.out.printf("There are %d days in " + month , daysInMonth);
	    }

	}

