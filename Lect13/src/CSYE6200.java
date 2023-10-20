
public class CSYE6200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		new B();
	}

}
class A {
	int i = 7;
	
	public A() {
		setI(20);
		System.out.println("i from A is "+ i);
	}
	
	public void setI(int i) {
		System.out.println("A's setI is called "+ i);
		//i is public and global for class A, gets overwritten
		this.i = 2 * i;
	}
	
}
//i = 40

class B extends A {
	public B(){
		System.out.println("i from B is "+ i);

		}
	//overwrites A's setI 
	//i as i = 20 is sent from A
	public void setI(int i) {
		System.out.println("B's setI is called.");
		this.i = 3 * i;

	}
}
