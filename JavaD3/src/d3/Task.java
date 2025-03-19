package d3;
import java.util.*;
class Book{
	int bid;
	String title;
	String author;
	double price;
	Book(int a, String b, String c,double d){
		this.bid=a;
		this.title=b;
		this.author=c;
		this.price=d;
	}
	void displaydetails() {
		System.out.println("BOOK ID:"+ bid);
		System.out.println("BOOK TITLE:"+ title);
		System.out.println("BOOK AUTHOR:"+ author);
		System.out.println("BOOK PRICE:"+ price);

	}
}
public class Task {

	public static void main(String[] args) {
            Book b1=new Book(1,"harry potter","jk royling",1500);
            Book b2=new Book(2,"harry2 ","jk royling",1500);
            Book b3=new Book(3,"harry potter3","jk royling",1500);
            b1.displaydetails();
            b2.displaydetails();
            b3.displaydetails();

            
	}

}
