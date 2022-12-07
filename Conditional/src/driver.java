
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		if(x > 18) System.out.print("Adult");
		
		//if-else
		
		if(x > 0) System.out.print("+ve");
		else System.out.print("Non +ve");
		
		// nested if
		if(x < 2) 
			if(x < -1) 
				if(x <-10) System.out.print("hello");
		// if-else-if
		if(x == 1) 
			System.out.print("1");
		else if(x == 2) 
			System.out.print("2");
		else 
			System.out.print("Any");
		
		switch(x) {
		case 0:
			System.out.print("0");
			break;
		case 1:
			System.out.print("1");
			break;
		default:
			System.out.print("annyy");
		}
		int y = 0;
		for(;y<5;y++) System.out.println(y);
		
		y = 0;
		for(;y<5;) {
			System.out.print(y);	
			y++;
		}
		while(y>-1) {
			System.out.print(y);
			y--; 
		}
		int n = 5;
		for(int i=0 ; i<=10 ; i++) System.out.println(n*i);
	}

}
