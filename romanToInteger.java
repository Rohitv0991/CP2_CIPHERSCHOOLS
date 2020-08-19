/*Given a roman numeral, convert it to an integer. 

Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3  */

//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> translator = new HashMap<>();
        translator.put('I', 1);
        translator.put('V', 5);
        translator.put('X', 10);
        translator.put('L', 50);
        translator.put('C', 100);
        translator.put('D', 500);
        translator.put('M', 1000);
        
       int n = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(translator.get(s.charAt(i)) < translator.get(s.charAt(i + 1)))
                n -= translator.get(s.charAt(i));
            else n += translator.get(s.charAt(i));
        }
        n += translator.get(s.charAt(s.length() - 1));
        return n;
    }
}