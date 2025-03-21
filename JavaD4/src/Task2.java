package d4;
class Animal{
	void dog() {
		System.out.println("Dog Barks!!");
	}
}
class Dog extends Animal{
	void cat() {
		System.out.println("cat meows!!");
	}
}
public class Task2 {

	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		a.dog();
		d.cat();

	}

}
