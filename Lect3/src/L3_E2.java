
import java.util.Scanner;

public class L3_E2 {
	//MY OWN METHods are defined on same level as main method 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = getDouble();
		System.out.print("Number received by user is: " + i);	

	}
	
	public static double getDouble() {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");

		double val = input.nextDouble();
		return val;
		
	}

}
