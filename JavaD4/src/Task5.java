package d4;
class pet{
	void brag() {
		System.out.println("I have the best pet ");
	}
}
	class An extends pet{
		void brag() {
			System.out.println("I have the best dog ");
			super.brag();
		}
	
}
public class Task5 {

	public static void main(String[] args) {
	An d=new An();
		d.brag();

	}

}
