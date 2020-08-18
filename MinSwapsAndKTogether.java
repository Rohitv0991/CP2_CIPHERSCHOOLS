/*Given an array of n positive integers and a number k. 
Find the minimum number of swaps required to bring all the numbers 
less than or equal to k together.

Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
Output: 1  */

// https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
import java.util.*; 
class MinSwapsAndKTogether { 

	static int minSwap(int arr[], int n, int k) {
		
		int count = 0, window = 0, result;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= k) count++;
			if(arr[i] > k) window++;
		}
		
		result = window;
		for(int i = 0, j = count; j < n; i++, j++) {
			if(arr[i] > k) window++;
			if(arr[j] > k) window--;
			
			result = Math.min(result, window);
		}
		
		return result;
	}
	
	public static void main(String[] args)  
	{ 
		int arr[] = {2, 1, 5, 6, 3}; 
		int n = arr.length; 
		int k = 3; 
		System.out.print(minSwap(arr, n, k) + "\n"); 
	  
		int arr1[] = {2, 7, 9, 5, 8, 7, 4}; 
		n = arr1.length; 
		k = 5; 
		System.out.print(minSwap(arr1, n, k)); 
	} 
} 
