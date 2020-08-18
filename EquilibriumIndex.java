/* Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of all the numbers to the left of the index

is equal to the sum of all the numbers to the right of the index.*/

//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++) {
            
            if(sum - sum2 - nums[i] == sum2) return i;
            sum2 += nums[i];
        }
        return -1;
    }
}
