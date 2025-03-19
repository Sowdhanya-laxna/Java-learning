package d3;
import java.util.*;
class Student{
	private String name;
		public String getName() {//getter
			return name;
		}
	public void setName(String name ) {//setter
		if(name!=null && !name.isEmpty()) {
			this.name=name;
		} else {
			System.out.println("INVALID NAME!!!");
		}
	}
}
public class Encapsulation {
public static void main(String[]args) {
	Student s=new Student();
	s.setName("sowdhanya");
	System.out.println("STUDENT NAME:"+s.getName());

}
}
