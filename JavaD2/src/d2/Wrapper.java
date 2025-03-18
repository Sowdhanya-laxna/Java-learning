package d2;
import java.util.*;
public class Wrapper {
	public static void main(String[]args) {
		Integer myInt=Integer.valueOf(100);
		Double myDouble= Double.valueOf(12.34);
		Character myCharacter=Character.valueOf('A');
		Boolean myBool=Boolean.valueOf(true);
		
		
		
		Integer intobj=50;//auto-boxing
		int intValue=intobj;//un-boxing
		System.out.println(intValue);
		
	}

}
