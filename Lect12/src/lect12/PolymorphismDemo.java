package lect12;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new objs 
		
//		new grad is class type passed to the method m defined 
		m (new GraduateStudent()); // returns student as its overriffent by student class
		m (new Student());// returns student as its overriffent by student class
		m (new Person()); //returns person
		m (new Object()); // reference of the string 
	}
	//method with obj class args
	public static void m(Object x) {
		System.out.println(x.toString());
	}

}
//inherits everything from student class as is 
//therefore, gradstudent returns "student"
	class GraduateStudent extends Student {
}
//inherists everything from person class 
	//og tostring is overwriitten by student class
	class Student extends Person {
		//tostring is overridden 
		public String toString() {
		return "Student";
		}
}
	//ojb defines tostring 
class Person extends Object {
	public String toString() {
	return "Person";
	}
}

