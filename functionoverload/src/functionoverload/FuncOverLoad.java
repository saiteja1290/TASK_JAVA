package functionoverload;

public class FuncOverLoad {
	void Display() {
		System.out.println("No params");
	}
	void Display(String str) {
		System.out.println(str);
	}
	void Display(int x , int y) {
		System.out.println(x+y);
	}
}
