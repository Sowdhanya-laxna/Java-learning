package d4;
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		int n1;
		ArrayList<Integer>a=new ArrayList<Integer>();//declare the array-list
		/*a.add(100);
		a.add(200);
		System.out.println(a);*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		 n1=s.nextInt();
		for(int i=0;i<=n1;i++) {
			a.add(i);
			System.out.println(a);
		}

	}

}
