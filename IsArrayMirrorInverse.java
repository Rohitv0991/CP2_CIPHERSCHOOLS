// https://www.geeksforgeeks.org/check-if-the-given-array-is-mirror-inverse/
import java.io.*;

class GFG {
    static boolean isInverse(int[] arr) {
        boolean b = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr.length){
                b = false;
		        break;
            }
		    if(arr[arr[i]] == i) continue;
		    else {
		        b = false;
		        break;
		    }
		}
		return b;
    }
	public static void main (String[] args) {
		int arr[] = new int[]{3, 4, 2, 0, 1};
		boolean result = isInverse(arr);
		System.out.println(result?"Yes":"No");
	}
}
