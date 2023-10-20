
import java.util.Scanner;

public class L2_E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int val; 
		do {
			System.out.print("Enter value: ");
			 val = input.nextInt();
		} while( val < 1 || val > 100 ); //MISTAKE - logic was reversed

	}

}
