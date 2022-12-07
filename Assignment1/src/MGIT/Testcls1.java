package MGIT;

public class Testcls1 {
	int htno;
	String sname;
	String branch;
	String acadyear;
	String addr;
	long numb;
	public Testcls1(int hno ,String snam , String branc , String acadyea , String add , long num ) {
		htno=hno;
		sname = snam;
		branch = branc;
		acadyear = acadyea;
		addr = add;
		numb = num;
		
	}
	public void display() {
		System.out.println("Ht no : " + htno);
		System.out.println("sname : " + sname);
		System.out.println("branch : " + branch);
		System.out.println("acadyear : " + acadyear);
		System.out.println("address : " + addr);
		System.out.println("Ht no : " + numb);
	}
}
