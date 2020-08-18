import java.util.*;
import java.lang.*;
import java.io.*;
class EquilibriumIndex
 {
    static Scanner scan = new Scanner(System.in); 
    
    static int equilibrium() {
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        int lsum = 0;
        for(int i = 0; i < n; i++){
            if(sum - arr[i] == lsum*2) return i + 1;
            lsum += arr[i];
        }
        
  
        // return -1 if no equilibrium index is found
        return -1;
    }
	public static void main (String[] args)
	 {
	    
	    int T = scan.nextInt();
	    
	    while(T-- > 0){
	      int index = equilibrium();
	      System.out.println(index);
	    }
	 }
}
