package oops;
import java.util.*;
class Student{//class creation
	String name="Sowdhanya";
	int rollNum=37;
	String dept="ss";
	
	void displayStudent() {  //method
		System.out.println("My name is:"+name);
		System.out.println("My Rollno is:"+rollNum);
		System.out.println("My dept is:"+dept);
	}
}
public class Clsobj {

	public static void main(String[] args) {
		Student s=new Student();//object creation
		s.displayStudent();//calling-method

	}

}
