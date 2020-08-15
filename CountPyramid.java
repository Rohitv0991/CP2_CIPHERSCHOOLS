import java.util.Scanner;
public class CountPyramid {
		
	static void countPyramid(int n) {
		int c = 1;
		for(int i = 0; i < n; i++) {
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
		
		countPyramid(n);
	}
}
