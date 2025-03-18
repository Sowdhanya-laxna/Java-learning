import java.util.*;
public class Operator {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);//ARITHMETIC OPERATOR
		System.out.println("ARITHMETIC OPERATION IS PERFORMED!!");
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);//RELATIONAL OPERATOR
		System.out.println("RELATIONAL OPERATION IS PERFORMED!!");
		
		
		//boolean c=true;
		//boolean d=false;
		
		System.out.println(a<b && a==10);//LOGICAL OPERATOR
		System.out.println("LOGICAL OPERATION IS PERFORMED!!");
		
		
		int x=10;
		System.out.println("POST-INCREMENTATION");
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);//post increment
		
		
		System.out.println("PRE-INCREMENTATION");
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);//pre increment
		
		
		System.out.println("POST-DECREMENTATION");
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);//post decrement
		
		System.out.println("PRE-DECREMENTATION");
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);//pre decrement //UNARY OPERATOR
		
		
		int S=300;
		System.out.println(S+=200);
		System.out.println(S-=200);//ASSIGNMENT OPERATOR
		System.out.println("ASSIGNMENT OPERATION IS PERFORMED!!");
		
		
		int D=10;
		int A=20;
		D=D+A;
		A=D-A;
		D=D-A;
		System.out.println(D);
		System.out.println(A);//SWAPPING
		System.out.println("SWAPPING  IS PERFORMED!!");
		
		
	
		int age=18;
		
		System.out.println("TENARY OPERATION !!");
		 String result=(age>=18)?"ELIGIBLE TO VOTE":"NOT-ELIGIBLE TO VOTE";
		 System.out.println(result);//TENARY OPERATION
		 
		 
		 int h=10;
		 int q=30;
		 System.out.println(h&q);
		 System.out.println(h|q);
		 System.out.println(h^q);
		 System.out.println(~h);//BITWISE OPERATOR
		 System.out.println("BITWISE OPERATION IS PERFORMED!!");
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
