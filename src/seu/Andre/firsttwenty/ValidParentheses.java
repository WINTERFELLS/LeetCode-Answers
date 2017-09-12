package seu.Andre.firsttwenty;

import java.util.Stack;

class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if((!st.empty()) && st.peek().equals('(')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if((!st.empty()) && st.peek().equals('{')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if((!st.empty()) && st.peek().equals('[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }                    
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }            
    }
}
