package d4;

import java.util.*;

public class Arraylistforeach {
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		System.out.println(a.get(0));//get method
		System.out.println("*******************");
		System.out.println(a.set(0, 1000)+" is modified in index 0");//set method
		System.out.println("*******************");
		System.out.println(a.get(0));
		System.out.println("*******************");
		System.out.println(a.remove(0)+" is removed from the list");
		System.out.println("*******************");
		System.out.println(a.get(0));
		System.out.println("*******************");
		for(int i:a) {//for-each
			System.out.println(i);
		}
	}
}
 