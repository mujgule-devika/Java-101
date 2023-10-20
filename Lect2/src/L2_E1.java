
import java.util.Scanner;

public class L2_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Variable One: ");
		
		int varOne = input.nextInt();
		System.out.print("Enter Variable Two: ");

		int varTwo = input.nextInt();
		System.out.print("Enter Variable Three: ");
		
		int varThree = input.nextInt();

		double avg = (varOne + varTwo + varThree) / 3.0; //mistakes - 3 should be 3.0 since data type is double. using 3.0 is imp
		
		System.out.print("Average of numbers is: " + avg);
		
	}

}
