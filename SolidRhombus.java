import java.util.*;
public class SolidRhombus {
	static void solidRhombus(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		solidRhombus(n);
	}
}
