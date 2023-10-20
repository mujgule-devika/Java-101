
public class L10_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] w = {"Dog", "Cat", "Fish", "Bird", "Horse"};
		makeSentence(w);
		System.out.println(makeSentence(w));

 	}
	
	public static String makeSentence( String[] s) {
		StringBuffer newString = new StringBuffer();
		for (int i = 0; i < s.length; i++) {
			newString.append(s[i] + " ");
		}
		return newString.toString();
		
		//can be replaced by 
	}

}
