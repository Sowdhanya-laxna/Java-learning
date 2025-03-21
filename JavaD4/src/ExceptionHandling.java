package d4;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int num=10/0;//Arithmetic Exception
		}catch(ArithmeticException e) {
			System.out.println("can't divide:"+e.getMessage());
		}finally {
			System.out.println("Execution completed");
		}
	}

}
