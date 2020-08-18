/*Given a positive integer n, find the least number of perfect square numbers 
(for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.*/

//https://leetcode.com/problems/perfect-squares/

class PerfectSquares {
    public int numSquares(int n) {
        
       int[] result = new int[n + 1];
        
        for(int i = 0; i <= n; i++) {
            // initialize result array
            result[i] = i;
           
            for(int j = 1; j*j <= i; j++) {
                
                 // calculate min value at current index and at [i-j*j] + 1 indices
                result[i] = Math.min(result[i-j*j] + 1, result[i]);
            }
        }
        return result[n];
    }
}
}