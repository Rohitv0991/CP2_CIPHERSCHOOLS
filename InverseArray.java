import java.util.Scanner;

class InverseArray {
    static boolean inverseCheck(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
	       if(arr[arr[i]] != i) return false;
	    }
	    return true;
    }
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = scan.nextInt();
	    }
	    scan.close();
	    System.out.println(inverseCheck(arr)?"Yes":"No");
	}
}
