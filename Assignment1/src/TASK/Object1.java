package TASK;

public class Object1 {
	int tid;
	String tname;
	String duration;
	String eout;
	public Object1(){
		tid = 50;
		tname = "JAVA OOPS";
		duration = "3 days";
		eout = "Internship";
	}
	public void output() {
		System.out.println("Task ID : " + tid);
		System.out.println("Task Name: " + tname);
		System.out.println("Task Duration : " + duration);
		System.out.println("Expected Output " + eout);
	}
}
