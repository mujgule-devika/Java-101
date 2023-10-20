
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L5_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner file = new Scanner(new File("integers.txt"))) {
			for (int i = 1; i <= 5; i++) {
					int nextInt = file.nextInt();
					System.out.println(nextInt);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File test.txt not found!");
			System.exit(0);
		}

	}

}
