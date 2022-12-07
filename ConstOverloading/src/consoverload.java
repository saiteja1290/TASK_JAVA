
public class consoverload {
	consoverload(){
		System.out.println("No arg constructor");
	}
	consoverload(int x){
		System.out.println("From with arg no return " + x);
	}
	consoverload(int x , int y){
		System.out.println("From with arg with return" + (x+y));
//		return (x+y)
	}
}
