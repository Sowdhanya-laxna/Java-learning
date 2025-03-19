package oops;
import java.util.*;
class Hotel{
	int total;
	String dish="Biriyani";
	int quantity=2;
	int price=100;
	void Bill() {
		System.out.println("YOUR ORDER!!!");
		System.out.println("**********************");
		System.out.println("My Dish is:"+dish);
		System.out.println("My Quantity is:"+quantity);
		System.out.println("My Price is:"+price);
		total=price+price;
		System.out.println("My Total is:"+total);
		System.out.println("**********************");
	}
}
public class Eg {
     public static void main(String[]args) {
    	 Hotel h=new Hotel();
    	 h.Bill();
     }
}
 