
class NU{
	public NU(){
		//this is executed 2. 
		System.out.println("This is NU no-arg constructor.");
	}
}

class MGEN extends NU{
	//mgen is subclass so we go to superclass NU to exec it first
	public MGEN(){
		//we come back after exec superclass and print this 3. 
		System.out.println("This is MEGN no-arg constructor.");
	}
}

public class Inheritance_1 {
	public static void main(String[] args){
		//we first go to main 1. 
		System.out.println("Before MGEN object is created.");
		
		//we create new obj of mgen. we go to new obj 
		MGEN mgen = new MGEN();
		
		//finally we come here and exec this 4. 
		System.out.println("After MGEN object is created.");
	}
}
