package d3;
import java.util.*;
class Bike{  //class
	int c2;
	String name;
	Bike(int c2,String name){ //parameterized-construcor 
		this.c2= c2;
		this.name=name;
	}
	void display() {  //method
		System.out.println("BIKE COUNT:"+ c2);
		System.out.println("BIKE NAME:"+ name);
	}
}

public class Constructor2 {
	public static void main(String[] args) {
            Bike c=new Bike(2,"GT");
            c.display();//method call
	}

}
