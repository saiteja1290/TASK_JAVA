import CBIT.Objcls1;
import CBIT.Objcls2;
import CBIT.Objcls3;

import MGIT.Testcls1;
import MGIT.Testcls2;
import MGIT.Testcls3;

import TASK.Object1;
import TASK.Object2;
import TASK.Object3;

public class drivercls {
	public static void main(String[] args) {
		Objcls1 obj1;
		obj1 = new Objcls1();
		obj1.displaydata();
		
		Objcls2 obj2;
		obj2 = new Objcls2();
		obj2.displaydata();
		
		Objcls3 obj3 = new Objcls3();
		obj3.displaydata();
		
		System.out.println();
		
		Testcls1 test1 = new Testcls1(123,"Teja","CSM","2021-2025","Malakpet",1234);
		Testcls2 test2 = new Testcls2(1223,"hello","CSM","2021-2025","Malakpet",12314);
		Testcls3 test3 = new Testcls3(112223,"hi","CSM","2021-2025","Malakpet",839283746);
		
		test1.display();
		test2.display();
		test3.display();
		
		Object1 object1 = new Object1();
		object1.output();
		Object2 object2 = new Object2();
		object2.output();
		Object3 object3 = new Object3();
		object3.output();
	}
}
