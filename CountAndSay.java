/*The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.*/

//https://leetcode.com/problems/count-and-say/

class Solution {
    public String countAndSay(int n) {
        // base String
        String s = "1";
        for(int i = 1; i < n; i++) {
            //after every iteration value of s is updated 
            //and passed in counter() again
            s = counter(s);
        }
        
        //finally return result for n
        return s;
    }
    
    static String counter(String s) {
        // at every call we create a new sb
        StringBuilder sb = new StringBuilder();
        
        //set variables to iterate
        int count = 1;
        char c = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++) {
            // count countiguous same characters
            if(s.charAt(i) == c) count++;
            
            else {
                // if character changes then we append its count
                // and character itself in sb
                sb.append(count);
                sb.append(c);
                // move to next character and set count to 1
                c = s.charAt(i);
                count = 1;
            }
            
        }
        // last character has to be appended separately
        sb.append(count);
        sb.append(c);
        
        //return final sb
        return sb.toString();
    }
}