package d3;
class Animal{//base-class
	void sound() {
		
	System.out.println("ANIMAL MAKE SOUNDS.");
}
}
class Dog extends Animal {//sub-class
	void bark() {
		System.out.println("Dog barks.");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog d1=new Dog();//object for the sub-class
		d1.sound();
		d1.bark();

	}

}
