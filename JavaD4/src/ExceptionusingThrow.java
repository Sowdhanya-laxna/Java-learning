package d4;

public class ExceptionusingThrow {
static void checkAge(int age) {
	if(age<18) {
		throw new IllegalArgumentException("Age must be 18 or older.");
	}
	System.out.println("Access Granted");
}
	public static void main(String[] args) {
try {
	checkAge(16);
}catch(IllegalArgumentException e) {
	System.out.println("Caught Exception:"+e.getMessage());
	
}
	}

}
