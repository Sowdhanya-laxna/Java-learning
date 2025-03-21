package d4;
class Candy{
	void taste() {
		System.out.println("Tastes chocolately!!");
	}
}
class choclate extends Candy{
	void taste() {
		System.out.println("tastes sweet!!");
		System.out.println("Tastes chocolately!!");
	}
}
public class Task3 {

	public static void main(String[] args) {
	Candy c=new Candy();
	choclate c1=new choclate();
	c.taste();
	c1.taste();
	
	
	}

}
