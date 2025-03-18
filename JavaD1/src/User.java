import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner n =new Scanner(System.in);
		
		System.out.println("ENTER THE NAME:");
		String name= n.nextLine();
		
		System.out.println("ENTER THE MARKS1:");
		int marks= n.nextInt();
		
		System.out.println("ENTER THE MARKS2:");
		int marks2= n.nextInt();
	
		
		System.out.println("ENTER THE AVERAGE:");	
		float avg= n.nextFloat();
		
		System.out.println("MY NAME IS "+name);
		System.out.println("MY MARK IS "+marks);
		System.out.println("MY MARK IS "+marks2);
		System.out.println("average is  "+avg);

	}

}