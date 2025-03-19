package d3;
class Animal3{//parent-class
	void sound() {
		
	System.out.println("ANIMALS MAKE SOUNDS.");
}
}
class Dog3 extends Animal3{//child-class
	void bark() {
		System.out.println("Dog barks.");
	}
}
class cat extends Animal3{//grandchild-class
	void meows() {
		System.out.println("cat meow");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog3 d=new Dog3();
		cat c=new cat();
		d.bark();
		c.meows();
		d.sound();

	}

}
