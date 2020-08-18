/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] */

// https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
    
    int j = 0;
    for(int i=0;i<n;i++){
        res[j] = nums[i];
        res[j+1] = nums[i+n];
        j=j+2;
    }
    return res;
    }
}
