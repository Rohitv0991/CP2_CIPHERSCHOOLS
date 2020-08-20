/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.*/

//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{') st.push(c);
            
            else if(c == ')') {
                if(!st.empty() && st.peek() == '(') st.pop();
                else return false;
            }
            
            else if(c == '}') {
                if(!st.empty() && st.peek() == '{') st.pop();
                else return false;
            }
            
            else if(c == ']') {
                if(!st.empty() && st.peek() == '[') st.pop();
                else return false;
            }
            
            else return false;            
        }
        
        if(st.empty()) return true;
        else return false;
    }
}