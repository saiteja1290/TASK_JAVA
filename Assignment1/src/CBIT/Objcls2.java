package CBIT;

public class Objcls2 {
	int htno;
	String sname;
	String branch;
	String acadyear;
	String address;
	long mno;
	public Objcls2(){
		htno = 12290;
		sname = "asdf";
		branch = "CSM";
		acadyear = "2021 - 2025";
		address = "hyd";
		mno = 1234567891;
	}
	public void displaydata() {
		System.out.println("ht no : "+htno);
		System.out.println("student name : "+ sname);
		System.out.println("branch : "+ branch);
		System.out.println("acadamic year : "+ acadyear);
		System.out.println("address "+ address);
		System.out.println("Mobile Number "+ mno);
	}
}
