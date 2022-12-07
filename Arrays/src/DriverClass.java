import java.util.Scanner;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner s;
		s = new Scanner(System.in);
		for(int i = 0 ; i<5 ; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(a[i]);
		}
		int[][] b =  new int[3][3];
		for(int i = 0 ; i<3 ; i++) {
			for(int j =0 ; j<3 ; j++) {
				b[i][j] = s.nextInt();
			}
		}
		for(int i = 0 ; i<3 ; i++) {
			for(int j =0 ; j<3 ; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
