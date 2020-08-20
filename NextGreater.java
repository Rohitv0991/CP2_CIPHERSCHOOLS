/*You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
If it does not exist, output -1 for this number.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]*/

//https://leetcode.com/problems/next-greater-element-i/submissions/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
           
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            //for every num in nums2 
            while (!stack.isEmpty() && stack.peek() < num)
                //we store that num and next grater value from num
                map.put(stack.pop(), num);
            //push if stack empty
            stack.push(num);
        }  
        
        for (int i = 0; i < nums1.length; i++)
            //if greater value exists then we find that nums1[i] and greater value
            //if map doesn't has nums1[i] as key means greater value not exist
            nums1[i] = map.getOrDefault(nums1[i], -1);
        
        return nums1;
    
    }
}