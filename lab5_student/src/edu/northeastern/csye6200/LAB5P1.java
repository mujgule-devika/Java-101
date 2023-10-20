package edu.northeastern.csye6200;

public class LAB5P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		 MyInteger n1 = new MyInteger(7);
	     MyInteger n2 = new MyInteger(24);
	     

	        System.out.println("n1 is even? " + n1.isEven()); // n1 is even? false
	        System.out.println("n1 is prime? " + n1.isPrime()); // n1 is prime? true
	        System.out.println("15 is prime? " + MyInteger.isPrime(15)); // 15 is prime? false
	        char[] charArray = {'4', '3', '7', '8'};
	        System.out.println("parseInt(char[]) for { '4', '3', '7', '8' } = " + MyInteger.parseInt(charArray)); // parseInt(char[]) for { '4', '3', '7', '8' } = 4378
	        String str = "4378";
	        System.out.println("parseInt(String) for \"4378\" = " + MyInteger.parseInt(str)); // parseInt(String) for "4378" = 4378
	        System.out.println("n2 is odd? " + n2.isOdd()); // n2 is odd? false
	        System.out.println("45 is odd? " + MyInteger.isOdd(45)); // 45 is odd? true
	        System.out.println("n1 is equal to n2? " + n1.equals(n2)); // n1 is equal to n2? false
	        System.out.println("n1 is equal to 5? " + n1.equals(5)); // n1 is equal to 5? false
	  
	}
}

class MyInteger {
	
	// TODO: write your code here
	// 1. data field 
	int value;
	
	// 3. getter method 
	public int getValue() {
		// TODO: write your code here
		return value;
	}
	// 2. constructor creating obj from int value 
	public MyInteger(int value) {
		// TODO: write your code here
		//create obj using new value
		this.value = value;
	}

	// 4.1 isEven method
	public boolean isEven() {
		// TODO: write your code here
		return (value % 2 == 0);
	}
	//5.1 static method for passed value
	public static boolean isEven(int n) {
		// TODO: write your code here
		return (n % 2 == 0);
	}
	// 6.1 args as object
	public static boolean isEven(MyInteger o) {
		// TODO: write your code here
		return o.isEven();
	}
	// 4.2 isOdd method
	public boolean isOdd() {
		// TODO: write your code here
		return (value % 2 == 1);
	}
	//5.2 static method for passed value
	public static boolean isOdd(int n) {
		// TODO: write your code here
		return (n % 2 == 1);
	}
	// 6.1 args as object
	public static boolean isOdd(MyInteger n) {
		// TODO: write your code here
		return n.isOdd();
	}
	// 4.3 isPrime method
	public boolean isPrime() {
		// TODO: write your code here
		  if (value <= 1) return false;
		  // 2 is prime 
	      if (value == 2) return true;
	      //anything divisible by 2 is not prime 
	      if (value % 2 == 0 ) return false;
	      //prime num check  
	      for (int i = 3; i * i <= value; i += 2) {
	          if (value % i == 0) {
	              return false;
	          }
	      }
	      return true;
	    
	}
	//5.3 static method for passed value
	public static boolean isPrime(int num) {
		// TODO: write your code here
		 if (num <= 1) return false;
		  // 2 is prime 
	      if (num == 2) return true;
	      //anything divisible by 2 is not prime 
	      if (num % 2 == 0 ) return false;
	      //prime num check  
	      for (int i = 3; i * i <= num; i += 2) {
	          if (num % i == 0) {
	              return false;
	          }
	      }
	      return true;
	}
	// 6.1 args as object
	public static boolean isPrime(MyInteger o) {
		// TODO: write your code here
		return o.isPrime();
	}
	// 7.1 check values 
	public boolean equals(int anotherNum) {
		// TODO: write your code here
		return value == anotherNum;
	}
	// 7.2 check for obj value 
	public boolean equals(MyInteger o) {
		// TODO: write your code here
		return value == o.getValue();
	}

	public static int parseInt(char[] numbers) {
		// numbers consists of digit characters.
		// For example, if numbers is {'1', '2', '5'}, the return value
		// should be 125. Please note that
		// numbers[0] is '1'
		// numbers[1] is '2'
		// numbers[2] is '5'

		// TODO: write your code here
		 int intValue = 0;
		    for (char c : numbers) {
		      int digit = Character.getNumericValue(c);
		       
		      if (digit >= 0 && digit <= 9) {
		        	intValue = intValue * 10 + digit;
		        }
		      else {
		            throw new NumberFormatException("Invalid character in the input array.");
		        }
		    }
		    return intValue;
	}

	public static int parseInt(String s) {
		// s consists of digit characters.
		// For example, if s is "125", the return value
		// should be 125.
		
		// TODO: write your code here
		return parseInt(s.toCharArray());
	}
}