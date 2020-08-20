/*Input: n = 4
Output: 4

Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4 */

// https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    public int tribonacci(int n) {
        return addTribonacci(n, 0, 1, 1);
    }
    
    static int addTribonacci(int n, int a, int b, int c) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        
        int sum = a + b + c;
        if(n == 3) return sum;
        return addTribonacci(n - 1, b, c, sum);
    }
}