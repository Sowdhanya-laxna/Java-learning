import java.util.*;
public class Controlstatement {

	public static void main(String[] args) {
		
		System.out.println("\nSIMPLE IF & IF-ELSE ");
		int a=10;
		int b=20;
		if(a>b) {
			System.out.println("A IS LESS THAN B");
		}else {
			System.out.println("A IS GREATER THAN B");//if & if-else
		}
		
		System.out.println("\nNESTED-IF");
		
		int x=20;
		
		if(x<=b) {
			if(x%2==0) {
				System.out.println("A IS EVEN-NUMBER");//nested-if
			}
		}
		
		System.out.println("\nLADDER-IF/ IF-ELSE-IF");
		
		int s=100;
		int o=200;
		int w=300;
		if(s>0 && s>w) {
			System.out.println("S IS GREATER");
		}else if(o>s && o>w) {
			System.out.println("O IS GREATER");
		}else if(w>s && w>o) {
			System.out.println("W IS GREATER");
		}else {
				System.out.println("\nALL ARE EQUAL!!!");//if-else-if
		}
		
		System.out.println("\nSWITCH-CASE!!!");
		
		Scanner S=new Scanner(System.in);
		System.out.println("\nENTER THE VALUE:");
		int d=S.nextInt();
		System.out.println("\nENTER THE VALUE:");
		int e=S.nextInt();
		char result;
		System.out.println("\n+,-");
		result=S.next().charAt(0);
		switch(result) {
		case '+':
			int c= d+e;
			System.out.println("ADDITION :"+c);
			break;
		case'-':
			int f=d-e;
			System.out.println("SUBTRACTION :"+f);
			break;
			default:
				System.out.println("ENTER A VALID CHOICE!!");
				break;
		}//switch-case
		
		}

}
