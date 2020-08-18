/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3] */

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] bucket = new int[101];
        
        for(int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        for(int i = 1; i < 101; i++) {
            bucket[i] += bucket[i-1];
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            nums[i] = bucket[nums[i]-1];
        }
        
        return nums;
    }
}
