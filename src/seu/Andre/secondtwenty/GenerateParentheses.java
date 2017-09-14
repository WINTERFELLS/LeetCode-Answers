package seu.Andre.secondtwenty;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
	private static final List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        res.clear();
        if(n == 0){
            return res;
        }
        else{
            StringBuffer str = new StringBuffer("");
            int left = n-1;
            int right = n;
            Stack<Character> stack = new Stack<>();
            str.append("(");
            dfs(left, right, stack, str);
        }
        return res;
    }
    
    public void dfs(int left, int right, Stack<Character> stack, StringBuffer str){
        if(str.charAt(str.length()-1) == '('){
        	stack.push('(');
        }
        else if(!stack.empty()){
        	stack.pop();
        }
        if(left == 0 && right == 0){
            String s = str.toString();
            if(res.contains(s)){
                return;
            }
            else{
                res.add(s);
                return;
            }
        }
        else if(left == 0){
            dfs(left,right-1,stack,str.append(")"));
            stack.push('(');
            str.deleteCharAt(str.length()-1);
        }
        else{
            if(stack.empty()){
                dfs(left-1,right,stack,str.append("("));
                stack.pop();
                str.deleteCharAt(str.length()-1);
            }
            else{
                dfs(left-1,right,stack,str.append("("));
                stack.pop();
                str.deleteCharAt(str.length()-1);
                dfs(left,right-1,stack,str.append(")"));
                stack.push('(');
                str.deleteCharAt(str.length()-1);
            }
        }
    }
}
