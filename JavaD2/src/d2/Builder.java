package d2;
import java.util.*;

public class Builder {



	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Hello");

		str.append("world");

		System.out.println("AFTER APPEND:"+str);//append

		str.insert(5,"," );

		System.out.println("AFTER INSERT:"+str);//insert

		str.replace(6, 11, "java");

		System.out.println("AFTER REPLACE:"+str);//replace

		str.reverse();

		System.out.println("AFTER REVERSE:"+str);//reverse

		

		



	}



}
