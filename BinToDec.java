import java.util.Scanner;

public class BinToDec {
	static void binToDec(int bin) {
		int p = 0;
		int dec = 0;
		while(bin > 0) {
			int i = bin%10;
			bin = bin/10;
			if(i != 0) dec += Math.pow(2, p);
			p++;
		}
		System.out.print(dec);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		binToDec(n);
	}
}
