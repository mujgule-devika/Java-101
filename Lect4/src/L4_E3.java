
import java.util.Scanner;

public class L4_E3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Enter a number to search: ");
	        int search = scanner.nextInt();
	        
	        int[] arry = {4,11,-3,0,46,11,9,-77,3,11};
	     
	        int op = searchArray(arry, search);
	        if (op == -1) {
			     System.out.println(" Its NOT a match!");
	        } else { 			     
	        		System.out.println( "Its a match!");
}
	}
	public static int searchArray (int[] a, int searchNum) {
		
		for (int i = 0; i < a.length; i++) {
			 if (a[i] == searchNum) {
				 return i;
			 }
		}
		return -1;
	}
}
