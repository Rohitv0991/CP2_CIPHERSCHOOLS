import java.util.Scanner;
public class DigitPyramid {
		
	static void digitPyramid(int n) {
		for(int i = 0; i < n; i++) {
			int c = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		digitPyramid(n);
	}
}
