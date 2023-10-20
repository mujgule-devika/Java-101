import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L5_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (PrintWriter fout = new PrintWriter(new File("testOut.txt"))) {
			
			for (int i = 1; i <= 100; i++) {
				fout.println(i);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File testOut.txt not found!");
			System.exit(0);
		}
	}
}
