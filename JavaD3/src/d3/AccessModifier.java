package d3;
import java.util.*;
class Access{
	public String name="Sowdhanya";
	private int age=20;
	protected String grade="A";
	String school="ABC School";
	public void displayInfo() {
		System.out.println("NAME :"+ name);
		System.out.println("AGE:"+ age);
		System.out.println("GRADE :"+ grade);
		System.out.println("SCHOOL :"+ school);
	}
}
public class AccessModifier {

	public static void main(String[] args) {
		Access a=new Access();
		a.displayInfo();
		System.out.println("PUBLIC NAME :"+ a.name);
		System.out.println("DEFAULT SCHOOL :"+ a.school);

	}

}
