package d3;


class Animal1{//parent-class
	void sound() {
		
	System.out.println("ANIMAL MAKE SOUNDS.");
}
}
class Dog2 extends Animal1 {//child-class
	void bark() {
		System.out.println("Dog barks.");
	}
}
class puppy extends Dog2{//grandchild-class
	void weep() {
		System.out.println("puppy weeps.");
	}
}
public class MultilevelInheritance {
public static void main(String[]args) {
	puppy p=new puppy();//object for grandchild-class
	p.sound();
	p.bark();
	p.weep();
}
}
