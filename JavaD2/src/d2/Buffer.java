package d2;
import java.util.*;

public class Buffer {



	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Hello");

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


