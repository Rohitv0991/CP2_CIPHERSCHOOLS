import java.util.Scanner;

public class ArraySum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt(); // no of test cases

		while(t-- > 0 ) {
			int a = 0, b = 0; // store digits in these variables
			
			int n = scan.nextInt(); //size of 1st array
			while(n-- > 0) {
				a *= 10;
				a+= scan.nextInt(); //directly convert to integer
			}
			
			int m = scan.nextInt(); //size of 2nd array
			while(m-- > 0) {
				b *= 10;
				b+= scan.nextInt(); //directly convert to integer
			}
			
			System.out.println(a+b); // print sum
		}
		scan.close();
	}
}
// PS: no array used hence space complexity reduced to O(1)
