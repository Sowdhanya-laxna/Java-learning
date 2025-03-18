import java.util.*;
public class Loops {
	public static void main(String[] args) {
		System.out.println("ASCENDING ORDER!! ");
		int n1=10;
		for(int i=0;i<=n1;i++) {
			System.out.println(i);
		}
		
		System.out.println("\nDESCENDING ORDER!! ");
		for(int i=1;n1>=i;n1--) {
			System.out.println(n1);
		}
		
		System.out.println("\nODD-NUMBER ORDER!! ");
		for(int i=1;n1>=i;n1--) {
			if(n1%2!=0) {
				System.out.println(n1);	
			}
		}

	}
}
