
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 10/0 ;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("dividing by 0");
	}
}