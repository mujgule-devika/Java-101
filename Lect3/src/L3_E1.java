
import java.util.Scanner;

public class L3_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner x = new Scanner(System.in);
//		System.out.print("Enter power of X: ");
//		
//		double y = 1;
//		double val = x.nextInt();
//		
//		double power = Math.pow(2, val);
//		System.out.print("power: " + power);
//
//		
		double x = 1;
		double pow2;
			while (x <= 32) {
				pow2 = Math.pow(2, x);
				System.out.printf("2^%.0f = %.0f%n", x, pow2);
				x++;
		} 

	}

}
