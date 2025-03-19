package d3;
interface Bike{
	void ride();
}
interface eat {
	void petrol();
}
class Human implements Bike,eat{
	public void ride() {
		System.out.println("GO FOR A RIDE!!");
	}
	public void petrol() {
		System.out.println("FIND A PETROL BUNK!!");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Human h=new Human();
		h.ride();
		h.petrol();

	}

}
