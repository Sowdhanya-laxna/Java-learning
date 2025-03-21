package d4;
import java.util.*;
public class Linkedlist {
	public static void main(String[] args) {
	LinkedList<Integer> a =new LinkedList<Integer>();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
	a.addFirst(37);
	a.addLast(500);
	System.out.println(a.get(0));//get method
	System.out.println("*******************");
	System.out.println(a.get(5));//get method
	System.out.println("*******************");
	System.out.println(a.set(0, 10)+" is modified in index 0");//set method
	System.out.println("*******************");
	System.out.println(a.get(0));
	System.out.println("*******************");
	System.out.println(a.remove(0)+" is removed from the list");//remove method
	System.out.println("*******************");
	System.out.println(a.get(0));
	System.out.println("*******************");
	System.out.println(a.size()+" is the size of the list");//size-of
	System.out.println("*******************");
	System.out.println(a.isEmpty());//is-empty
	System.out.println("*******************");
	for(int i:a) {//for-each
		System.out.println(i);
		
	}
}
}
