/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"  */

//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return ""; // if empty then return
        
		//set first String in the Sring array strs[] as prefix
        String prefix = strs[0];
        
		//iterate all strings one by one except the first string i.e. strs[0]
        for(int i = 1; i < strs.length; i++) {
			
			//for every string we check if 'prefix' is at the beginning or not
			// we enter in the loop if 'prefix' is not at beginning
            while(strs[i].indexOf(prefix) != 0) {
				
				// if prefix has become empty then return
                if(prefix == "") return "";
				
				//reduce length of prefix by 1
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}