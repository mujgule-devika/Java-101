
public class L4_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {2,4,5,6,7,8};
		addOne(arry);
	}
	//could return void 
	public static void addOne (int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			//a[i] = a[i] + 1;
			a[i]++;  //better syntax 
	        System.out.println(a[i]);

		}
//		return a;
	}

}
