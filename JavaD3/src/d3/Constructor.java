package oops;
import java.util.*;
class bike{  //class
	String color;
	bike(){
		    color="BLACK";
	}
	void display() {  //method
		System.out.println("BIKE COLOR:"+ color);
	}
}

public class Constructor {
	public static void main(String[] args) {
            bike c=new bike();//default constructor called
            c.display();//method call
	}

}



















